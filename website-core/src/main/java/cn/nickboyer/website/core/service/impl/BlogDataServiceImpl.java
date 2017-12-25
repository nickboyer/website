/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午1:31:42
 */
package cn.nickboyer.website.core.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;

import cn.nickboyer.website.api.common.PageData;
import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.entry.BtmtTimeline;
import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.service.IBlogDataService;
import cn.nickboyer.website.core.common.service.BaseService;
import cn.nickboyer.website.core.repository.BtmtMapper;
import cn.nickboyer.website.core.util.DateUtil;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Component
@Service
public class BlogDataServiceImpl extends BaseService implements IBlogDataService {

	@Autowired
	private BtmtMapper btmtMapper;

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#addBlog(cn.nickboyer.website.api.entry.Btmt)
	 */
	@Override
	public int addBlog(Btmt info) {

		return 0;
	}

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findList(cn.nickboyer.website.api.entry.Btmt, cn.nickboyer.website.api.common.PageData)
	 */
	@Override
	public List<Btmt> findList(Btmt info, PageData page) {

		/**
		 * 说明：分页显示文章，排序条件 1：时间 2：赞 3：爱心
		 */
		String orderBy = null;

		switch (page.getString("orderBy")) {
		case "1":
			orderBy = "create_time";
			break;

		case "2":
			orderBy = "agree";
			break;

		case "3":
			orderBy = "favour";
			break;

		default:
			orderBy = "create_time";
			break;
		}
		String order = null;

		switch (page.getString("order")) {
		case "1":
			order = "asc";
			break;

		case "0":
			order = "desc";
			break;

		default:
			order = "desc";
			break;
		}
		PageHelper.startPage(Integer.valueOf(page.getString("pageNum")), Integer.valueOf(page.getString("pageSize")));
		List<Btmt> list = btmtMapper.selectList(orderBy, order);
		return list;
	}

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findHottest()
	 */
	@Override
	@Transactional(readOnly = true, rollbackFor = Exception.class)
	public Btmt findHottest() {

		/**
		 * 说明：根据赞和爱心获取最热门文章
		 */
		return btmtMapper.selectHottest();

	}

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findById(java.lang.String)
	 */
	@Override
	@Transactional
	public Btmt findById(String id) {
		btmtMapper.updateWatch(id);
		return btmtMapper.selectById(id);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findAgrees()
	 */
	@Override
	public List<Btmt> findAgrees() {

		return btmtMapper.selectAgrees();
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findUserLasted()
	 */
	@Override
	public List<Btmt> findUserLasted(String id) {

		return btmtMapper.selectUserLasted(id);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findTimeline()
	 */
	@Override
	public List<BtmtTimeline> findTimeline() {
		List<BtmtTimeline> list = new ArrayList<>();
		BtmtTimeline timeline = null;
		List<Btmt> sames = null;
		List<Btmt> btmts = btmtMapper.selectTimeline();
		String time = null;
		for (Btmt btmt : btmts) {
			String createTime = DateUtil.toYYYY_MM(btmt.getCreateTime());
			if (!createTime.equals(time)) {

				if (StringUtils.isNotEmpty(time)) {
					list.add(timeline);
				}
				time = createTime;
				sames = new ArrayList<>();
				timeline = new BtmtTimeline(createTime, sames);
			}

			sames.add(btmt);
		}
		list.add(timeline);

		return list;
	}

	/*
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#itIndex(java.lang.String)
	 */
	@Transactional(readOnly = true)
	@Override
	public List<Btmt> itIndex(String themeIt) {

		return null;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#add(cn.nickboyer.website.api.entry.Btmt)
	 */
	@Override
	public ReturnInfo<String> add(Btmt info, Sut sut) {

		ReturnInfo<String> ri = new ReturnInfo<>();
		info.setUserid(sut.getId());
		info.setUserImg(sut.getUserImg());
		info.setUsername(sut.getUsername());
		info.setCreateTime(new Date());
		btmtMapper.insertBlog(info);
		ri.setAction("/blog/detail?id=" + info.getId());
		return ri;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findUserLastedByName(java.lang.String)
	 */
	@Override
	public List<Btmt> findUserLastedByName(String username) {
		return btmtMapper.selectUserLastedByName(username);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#findByComments()
	 */
	@Override
	public List<Btmt> findByComments() {

		return btmtMapper.selectComments();
	}

}

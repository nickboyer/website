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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;

import cn.nickboyer.website.api.common.PageData;
import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.service.IBlogDataService;
import cn.nickboyer.website.core.common.service.BaseService;
import cn.nickboyer.website.core.repository.BtmtMapper;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
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
	@Transactional(readOnly = true)
	public Btmt findById(String id) {

		return btmtMapper.selectById(id);
	}

}

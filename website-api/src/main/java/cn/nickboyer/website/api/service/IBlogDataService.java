/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午1:36:31
 */
package cn.nickboyer.website.api.service;

import java.util.List;

import cn.nickboyer.website.api.common.PageData;
import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.entry.BtmtTimeline;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
public interface IBlogDataService {

	/**
	 * 新增博客
	 * 
	 * @param info
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月1日 下午3:22:49
	 */
	int addBlog(Btmt info);

	/**
	 * 分页获取文章
	 * 
	 * @param info
	 * @param page
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年11月29日 下午2:42:13
	 */
	List<Btmt> findList(Btmt info, PageData page);

	/**
	 * 获取一篇最热门文章
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年11月29日 下午2:45:23
	 */
	Btmt findHottest();

	/**
	 * 通过ID获取文章
	 * 
	 * @param id
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月4日 下午3:13:35
	 */
	Btmt findById(String id);

	/**
	 * 获取置顶博客
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午10:12:12
	 */
	List<Btmt> findAgrees();

	/**
	 * 获取用户 最近十篇
	 * 
	 * @param id
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午11:12:37
	 */
	List<Btmt> findUserLasted(String id);

	/**
	 * 博客归档
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月10日 上午10:21:33
	 */
	List<BtmtTimeline> findTimeline();
}

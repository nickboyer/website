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

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
public interface IBlogDataService {

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
}

/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午5:17:32
 */
package cn.nickboyer.website.api.service;

import com.github.pagehelper.PageInfo;

import cn.nickboyer.website.api.entry.Test;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
public interface ITestService {

	/**
	 * 获取所有
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月1日 下午3:16:42
	 */
	PageInfo<Test> selectAll();
}

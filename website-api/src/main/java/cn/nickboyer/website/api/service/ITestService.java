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

	PageInfo<Test> selectAll();
}

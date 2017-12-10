/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午5:18:01
 */
package cn.nickboyer.website.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.nickboyer.website.api.entry.Test;
import cn.nickboyer.website.api.service.ITestService;
import cn.nickboyer.website.core.common.service.BaseService;
import cn.nickboyer.website.core.repository.TestMapper;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Component
@Service
public class TestServiceImpl extends BaseService implements ITestService {

	@Autowired
	private TestMapper mapper;

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.ITestService#selectAll()
	 */
	@Override
	public PageInfo<Test> selectAll() {
		PageHelper.startPage(2, 2);
		List<Test> selectAll = mapper.selectAll();
		return new PageInfo<>(selectAll);
	}

}

/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月8日 上午10:04:10
 */
package cn.nickboyer.website.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;

import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.service.ISutService;
import cn.nickboyer.website.core.repository.SutMapper;

/**
 * 用户service
 * 
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Component
@Service
public class SutServiceImpl implements ISutService {

	@Autowired
	private SutMapper sutMapper;

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.ISutService#findByName(java.lang.String)
	 */
	@Transactional(readOnly = true)
	@Override
	public Sut findByName(String username) {

		return sutMapper.selectByUsername(username);
	}

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.ISutService#findByUsernameAndPwd(java.lang.String, java.lang.String)
	 */
	@Transactional(readOnly = true)
	@Override
	public Sut findByUsernameAndPwd(String username, String password) {

		return sutMapper.selectByUsernameAndPwd(username, password);
	}

}

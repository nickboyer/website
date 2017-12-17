/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月8日 下午4:30:57
 */
package cn.nickboyer.website.core.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import cn.nickboyer.website.api.common.Const;
import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.service.IAdminService;
import cn.nickboyer.website.api.service.ISutService;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Component
@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private ISutService sutService;

	/**
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IAdminService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public ReturnInfo<Sut> login(String username, String password) {

		ReturnInfo<Sut> ri = new ReturnInfo<Sut>();
		Sut user = sutService.findByUsernameAndPwd(username, password);
		if (user == null) {

			ri.setResult(Const.FAILURE, "9999", "用户名或密码错误");
		}
		sutService.updateLoginTime(user.getId(), new Date());
		ri.setObj(user);
		return ri;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IAdminService#register(java.lang.String, java.lang.String)
	 */
	@Override
	public ReturnInfo register(String username, String password) {

		ReturnInfo ri = new ReturnInfo();
		ri.setStatus("1");
		ri.setCode("9999");
		ri.setMsg("敬请期待~");
		return ri;
	}

}

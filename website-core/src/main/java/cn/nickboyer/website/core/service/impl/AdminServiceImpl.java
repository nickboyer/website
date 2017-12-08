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

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

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
	public ReturnInfo login(String username, String password) {

		ReturnInfo ri = new ReturnInfo();
		Sut user = sutService.findByUsernameAndPwd(username, password);
		if (user == null) {

			ri.setResult(Const.FAILURE, "9999", "用户名或密码错误");
		}

		// 登录
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPwd());
		subject.login(token);
		subject.getSession().setAttribute("user", user);
		return ri;
	}

}

/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月8日 下午4:29:24
 */
package cn.nickboyer.website.api.service;

import cn.nickboyer.website.api.common.ReturnInfo;

/**
 * 
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
public interface IAdminService {

	/**
	 * 登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午4:30:28
	 */
	ReturnInfo login(String username, String password);

	/**
	 * 注册
	 * 
	 * @param username
	 * @param password
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午9:34:21
	 */
	ReturnInfo register(String username, String password);

}

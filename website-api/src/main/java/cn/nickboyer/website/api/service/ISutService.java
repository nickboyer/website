/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月7日 下午10:40:21
 */
package cn.nickboyer.website.api.service;

import cn.nickboyer.website.api.entry.Sut;

/**
 * 用户服务
 * 
 * @title
 * @description
 * @since JDK1.8
 */
public interface ISutService {

	/**
	 * @param username
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月7日 下午10:59:32
	 */
	Sut findByName(String username);

}

/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月16日 下午7:35:16
 */
package cn.nickboyer.website.api.service;

import java.util.List;

import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.entry.Uct;

/**
 * @title
 * @description
 * @since JDK1.8
 */
public interface ICommentService {

	/**
	 * @param info
	 * @param attribute
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月16日 下午7:42:36
	 */
	void reply(Uct info, Sut attribute);

	/**
	 * @param id
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月16日 下午8:05:14
	 */
	List<Uct> findAllCommentByRelid(Integer id);

}

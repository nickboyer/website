/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月8日 上午10:34:30
 */
package cn.nickboyer.website.core.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.nickboyer.website.api.entry.Sut;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Mapper
public interface SutMapper {

	/**
	 * 通过用户名获取用户
	 * 
	 * @param username
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 上午10:35:56
	 */
	@Select("select * from sut where username = #{username}")
	Sut selectByUsername(String username);

	/**
	 * @param username
	 * @param password
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午4:19:46
	 */
	@Select("select * from sut where username = #{username} and pwd = #{password}")
	Sut selectByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

}

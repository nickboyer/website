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

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	@Select("select * from SUT where username = #{username}")
	Sut selectByUsername(String username);

	/**
	 * @param username
	 * @param password
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午4:19:46
	 */
	@Select("select * from SUT where username = #{username} and pwd = #{password}")
	Sut selectByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

	/**
	 * @param id
	 * @param date
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月16日 下午5:05:50
	 */
	@Update("update sut set login_time = #{date} where id = #{id}")
	void updateLoginTime(@Param("id") Integer id, @Param("date") Date date);

}

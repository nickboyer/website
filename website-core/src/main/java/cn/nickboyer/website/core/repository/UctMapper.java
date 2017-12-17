/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月16日 下午7:48:33
 */
package cn.nickboyer.website.core.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.nickboyer.website.api.entry.Uct;

/**
 * @title
 * @description
 * @since JDK1.8
 */
@Mapper
public interface UctMapper {

	/**
	 * @param info
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月16日 下午7:51:14
	 */
	@Insert("insert into uct(relid,content,userid,username,create_time,user_img) values (#{relid},#{content},#{userid},#{username},#{createTime},#{userImg})")
	void insert(Uct info);

	/**
	 * @param id
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月16日 下午8:08:00
	 */
	@Select("select * from uct where relid = #{id} order by create_time asc")
	List<Uct> selectCommentByRelid(Integer id);

}

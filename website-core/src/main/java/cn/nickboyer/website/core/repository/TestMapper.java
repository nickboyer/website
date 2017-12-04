/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午2:54:08
 */
package cn.nickboyer.website.core.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.nickboyer.website.api.entry.Test;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Mapper
public interface TestMapper {

	/**
	 * 获取所有
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月1日 下午3:14:59
	 */
	@Select("select * from test")
	List<Test> selectAll();
}

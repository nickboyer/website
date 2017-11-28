/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午2:53:02
 */
package cn.nickboyer.website.api.entry;

import java.io.Serializable;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
public class Test implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1082796094340248486L;

	private Integer id;

	private String name;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id to set id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name to set name
	 */
	public void setName(String name) {
		this.name = name;
	}

}

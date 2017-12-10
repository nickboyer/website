/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月10日 上午10:30:01
 */
package cn.nickboyer.website.api.entry;

import java.io.Serializable;
import java.util.List;

/**
 * @title
 * @description
 * @since JDK1.8
 */
public class BtmtTimeline implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String time;

	private List<Btmt> list;

	/**
	 * @param createTime
	 * @param sames
	 */
	public BtmtTimeline(String createTime, List<Btmt> sames) {

		this.time = createTime;
		this.list = sames;
	}

	/**
	 * @return time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time 要设置的 time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return list
	 */
	public List<Btmt> getList() {
		return list;
	}

	/**
	 * @param list 要设置的 list
	 */
	public void setList(List<Btmt> list) {
		this.list = list;
	}

}

/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月16日 下午6:10:19
 */
package cn.nickboyer.website.api.entry;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title
 * @description
 * @since JDK1.8
 */
public class Uct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer relid;;

	private byte[] content;

	private String contentStr;

	private Integer userid;

	private String username;

	private String userImg;

	private Integer agree;

	private Date createTime;

	private String createTimeStr;

	private Date updateTime;

	/**
	 * @return createTimeStr
	 */
	public String getCreateTimeStr() {
		return createTimeStr;
	}

	/**
	 * @param createTimeStr 要设置的 createTimeStr
	 */
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	/**
	 * @return agree
	 */
	public Integer getAgree() {
		return agree;
	}

	/**
	 * @param agree 要设置的 agree
	 */
	public void setAgree(Integer agree) {
		this.agree = agree;
	}

	/**
	 * @return createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime 要设置的 createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		this.createTimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
	}

	/**
	 * @return updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime 要设置的 updateTime
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return userImg
	 */
	public String getUserImg() {
		return userImg;
	}

	/**
	 * @param userImg 要设置的 userImg
	 */
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id 要设置的 id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return relid
	 */
	public Integer getRelid() {
		return relid;
	}

	/**
	 * @param relid 要设置的 relid
	 */
	public void setRelid(Integer relid) {
		this.relid = relid;
	}

	/**
	 * @return content
	 */
	public byte[] getContent() {
		return content;
	}

	/**
	 * @param content 要设置的 content
	 */
	public void setContent(byte[] content) {
		this.content = content;
		this.contentStr = new String(content);
	}

	/**
	 * @return contentStr
	 */
	public String getContentStr() {
		return contentStr;
	}

	/**
	 * @param contentStr 要设置的 contentStr
	 */
	public void setContentStr(String contentStr) {
		this.contentStr = contentStr;
	}

	/**
	 * @return userid
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * @param userid 要设置的 userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username 要设置的 username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}

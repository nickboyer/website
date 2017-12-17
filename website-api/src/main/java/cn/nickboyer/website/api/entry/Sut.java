/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月7日 下午10:17:27
 */
package cn.nickboyer.website.api.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * @title
 * @description
 * @since JDK1.8
 */
public class Sut implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String username;

	private String userImg;

	private String pwd;

	private String name;

	private String cardid;

	private String phone;

	private String email;

	private String limits;

	private String roles;

	private String status;

	private String remark;

	private String sign;

	private Date createTime;

	private Date updateTime;

	private Date loginTime;

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
	 * @return pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd 要设置的 pwd
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return cardid
	 */
	public String getCardid() {
		return cardid;
	}

	/**
	 * @param cardid 要设置的 cardid
	 */
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone 要设置的 phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email 要设置的 email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return limits
	 */
	public String getLimits() {
		return limits;
	}

	/**
	 * @param limits 要设置的 limits
	 */
	public void setLimits(String limits) {
		this.limits = limits;
	}

	/**
	 * @return roles
	 */
	public String getRoles() {
		return roles;
	}

	/**
	 * @param roles 要设置的 roles
	 */
	public void setRoles(String roles) {
		this.roles = roles;
	}

	/**
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status 要设置的 status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark 要设置的 remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @param sign 要设置的 sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
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
	 * @return loginTime
	 */
	public Date getLoginTime() {
		return loginTime;
	}

	/**
	 * @param loginTime 要设置的 loginTime
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

}

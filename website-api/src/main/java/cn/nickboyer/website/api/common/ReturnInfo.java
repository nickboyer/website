/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月8日 下午3:30:21
 */
package cn.nickboyer.website.api.common;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
public class ReturnInfo {

	private String status = "0";

	private String msg = "success";

	private String code = "0000";

	/**
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status to set status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg to set msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code to set code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 设置响应结果
	 * 
	 * @param status
	 * @param code
	 * @param msg
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午4:34:39
	 */
	public void setResult(String status, String code, String msg) {

		this.status = status;
		this.code = code;
		this.msg = msg;
	}
}

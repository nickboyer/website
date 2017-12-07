/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年8月29日 上午11:34:31
 */
package cn.nickboyer.website.blog.common;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@JsonIgnoreProperties(value = { "reqChid", "reqTime", "reqNo" })
public class Result {

	/** 请求渠道号 */
	private String reqChid;

	/** 请求时间 */
	private String reqTime;

	/** 请求流水号 */
	private String reqNo;

	/** 响应代码 */
	private String code;

	/** 响应信息 */
	private String msg;

	private Map<String, Object> rspHead = new HashMap<>();

	private Map<String, Object> rspBody = new HashMap<>();

	public Result() {

	}

	public Result(String reqChid, String reqTime, String reqNo) {

		setReqChid(reqChid);
		setReqTime(reqTime);
		setReqNo(reqNo);
	}

	/**
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code 要设置的 code
	 */
	public void setCode(String code) {
		this.code = code;
		rspHead.put("code", code);
	}

	/**
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg 要设置的 msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
		rspHead.put("msg", msg);
	}

	/**
	 * @return rspBody
	 */
	public Map<String, Object> getRspBody() {
		return rspBody;
	}

	/**
	 * @param rspBody 要设置的 rspBody
	 */
	public void setRspBody(Map<String, Object> rspBody) {
		this.rspBody = rspBody;
	}

	/**
	 * @return reqChid
	 */
	public String getReqChid() {
		return reqChid;
	}

	/**
	 * @param reqChid 要设置的 reqChid
	 */
	public void setReqChid(String reqChid) {
		this.reqChid = reqChid;
		rspHead.put("reqChid", reqChid);
	}

	/**
	 * @return reqTime
	 */
	public String getReqTime() {
		return reqTime;
	}

	/**
	 * @param reqTime 要设置的 reqTime
	 */
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
		rspHead.put("reqTime", reqTime);
	}

	/**
	 * @return reqNo
	 */
	public String getReqNo() {
		return reqNo;
	}

	/**
	 * @param reqNo 要设置的 reqNo
	 */
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
		rspHead.put("reqNo", reqNo);
	}

	/**
	 * @return rspHead
	 */
	public Map<String, Object> getRspHead() {
		return rspHead;
	}

	/**
	 * @param rspHead 要设置的 rspHead
	 */
	public void setRspHead(Map<String, Object> rspHead) {
		this.rspHead = rspHead;
	}

	public static void main(String[] args) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		Result r = new Result("1", "20170101121212", "1");

		Map<String, Object> map = new HashMap<>(8);
		map.put("bindid", "A23A4926211D467885A3AD35E14144AD");
		map.put("cuid", "99000001453");
		map.put("acctNo", "6666882002000338928");
		// r.setRspBody(map);

		String s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(r);

		System.out.println(s);

	}

}

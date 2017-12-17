/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月15日 下午11:39:29
 */
package cn.nickboyer.website.api.service;

import java.io.InputStream;

import cn.nickboyer.website.api.common.ReturnInfo;

/**
 * @title
 * @description
 * @since JDK1.8
 */
public interface IImgService {

	/**
	 * @param inputStream
	 * @param fileName
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月15日 下午11:44:47
	 */
	ReturnInfo<String> upload(InputStream inputStream, String fileName);

}

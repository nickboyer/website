/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月15日 下午11:45:07
 */
package cn.nickboyer.website.core.service.impl;

import java.io.InputStream;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import cn.nickboyer.website.api.common.Const;
import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.service.IImgService;
import cn.nickboyer.website.core.common.service.BaseService;
import cn.nickboyer.website.core.util.SftpUtil;

/**
 * @title
 * @description
 * @since JDK1.8
 */
@Component
@Service
public class ImgServiceImpl extends BaseService implements IImgService {

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IImgService#upload(java.io.InputStream)
	 */
	@Override
	public ReturnInfo<String> upload(InputStream inputStream, String fileName) {
		ReturnInfo<String> ri = new ReturnInfo<>();

		String filename = UUID.randomUUID().toString().replaceAll("-", "") + fileName.substring(fileName.lastIndexOf("."));

		try {
			SftpUtil.upload(inputStream, filename);
		} catch (Exception e) {
			logger.error("上传失败", e);
			ri.setStatus("1");
			ri.setCode("9999");
			ri.setMsg("上传失败");
			return ri;
		}
		ri.setObj(Const.IMG_PREFIX + filename);
		return ri;
	}

}

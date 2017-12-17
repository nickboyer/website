/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月15日 下午10:03:21
 */
package cn.nickboyer.website.blog.controller.img;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.service.IImgService;
import cn.nickboyer.website.blog.controller.BaseComponent;
import cn.nickboyer.website.blog.util.SftpUtil;

/**
 * @title
 * @description
 * @since JDK1.8
 */
@Controller
@RequestMapping("/img")
public class ImgController extends BaseComponent {

	@Reference
	private IImgService imgService;

	@RequestMapping("/upload")
	@ResponseBody
	public ReturnInfo<String> upload(HttpServletRequest request, HttpServletResponse response) throws IOException {

		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;

		MultipartFile file = mRequest.getFile("file");

		// return imgService.upload(file.getInputStream(), file.getOriginalFilename());

		String fileName = file.getOriginalFilename();
		ReturnInfo<String> ri = new ReturnInfo<>();

		String filename = UUID.randomUUID().toString().replaceAll("-", "") + fileName.substring(fileName.lastIndexOf("."));

		try {
			SftpUtil.upload(file.getInputStream(), filename);
		} catch (Exception e) {
			logger.error("上传失败", e);
			ri.setStatus("1");
			ri.setCode("9999");
			ri.setMsg("上传失败");
			return ri;
		}
		ri.setObj(pro.getSftp().getPrefix() + filename);
		return ri;
	}
}

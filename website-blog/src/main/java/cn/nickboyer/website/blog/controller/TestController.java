/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午3:58:07
 */
package cn.nickboyer.website.blog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;

import cn.nickboyer.website.api.entry.Test;
import cn.nickboyer.website.api.service.ITestService;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseComponent {

	@Reference
	private ITestService service;

	@RequestMapping("/test")
	public Object test() {

		PageInfo<Test> info = service.selectAll();
		List<Test> list = info.getList();
		System.out.println(info);
		System.out.println(list);
		return "success";
	}
}

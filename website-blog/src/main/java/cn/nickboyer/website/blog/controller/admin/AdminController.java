/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月10日 下午3:08:47
 */
package cn.nickboyer.website.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.service.IAdminService;
import cn.nickboyer.website.blog.controller.BaseComponent;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Controller
@RequestMapping("/user")
public class AdminController extends BaseComponent {

	@Reference
	private IAdminService adminService;

	/**
	 * 跳转到登录页面
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午12:26:58
	 */
	@RequestMapping("/tologin")
	public String toLogin() {

		return "user/login";
	}

	@RequestMapping("/login")
	@ResponseBody
	public Object login(@RequestParam("username") String username, @RequestParam("password") String password) {

		ReturnInfo ri = adminService.login(username, password);
		return ri;
	}

	/**
	 * 跳转到注册页面
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午12:27:57
	 */
	@RequestMapping("/toregister")
	public String toRegister() {

		return "user/reg";
	}
}

/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月13日 下午9:09:44
 */
package cn.nickboyer.website.blog.controller.admin;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.nickboyer.website.blog.controller.BaseComponent;

/**
 * 用户管理
 * 
 * @title
 * @description
 * @since JDK1.8
 */
@Controller
@RequestMapping("/sut")
public class SutController extends BaseComponent {

	/**
	 * 跳转基本设置
	 * 
	 * @param mv
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月13日 下午10:31:47
	 */
	@RequestMapping("/toset")
	public ModelAndView toSet(ModelAndView mv) {

		mv.setViewName("user/set");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}

	/**
	 * 跳转我的主页
	 * 
	 * @param mv
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月13日 下午10:31:47
	 */
	@RequestMapping("/tohome")
	public ModelAndView toHome(ModelAndView mv) {

		mv.setViewName("user/home");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}

	/**
	 * 跳转用户中心
	 * 
	 * @param mv
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月13日 下午10:31:47
	 */
	@RequestMapping("/toindex")
	public ModelAndView toIndex(ModelAndView mv) {

		mv.setViewName("user/index");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}

	/**
	 * 跳转我的消息
	 * 
	 * @param mv
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月13日 下午10:31:47
	 */
	@RequestMapping("/tomessage")
	public ModelAndView toMessage(ModelAndView mv) {

		mv.setViewName("user/message");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}

}

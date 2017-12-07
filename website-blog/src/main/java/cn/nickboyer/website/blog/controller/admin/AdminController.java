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
import org.springframework.web.servlet.ModelAndView;

import cn.nickboyer.website.blog.controller.BaseComponent;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Controller
@RequestMapping("/home")
public class AdminController extends BaseComponent {

	@RequestMapping("/index")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/aboutme");
		return mv;
	}

	@RequestMapping("/index2")
	public ModelAndView home2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/index");
		return mv;
	}

	@RequestMapping("/gallery")
	public ModelAndView gallery() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/gallery");
		return mv;
	}

}

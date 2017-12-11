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

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.entry.BtmtTimeline;
import cn.nickboyer.website.api.service.IAdminService;
import cn.nickboyer.website.api.service.IBlogDataService;
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

	@Reference
	private IBlogDataService blogService;

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

	/**
	 * 登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月11日 下午11:48:40
	 */
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

	@RequestMapping("/register")
	@ResponseBody
	public Object register(@RequestParam("username") String username, @RequestParam("password") String password) {

		ReturnInfo ri = adminService.register(username, password);
		return ri;
	}

	/**
	 * 用户详情
	 * 
	 * @param mv
	 * @param id
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午11:08:03
	 */
	@RequestMapping("/home")
	public ModelAndView userDetail(ModelAndView mv, @RequestParam("id") String id) {

		// 获取用户最近发表的博客 10篇
		List<Btmt> list = blogService.findUserLasted(id);
		mv.addObject("list", list);
		mv.setViewName("user/home");
		return mv;

	}

	/**
	 * 跳转时间线
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月10日 上午10:16:55
	 */
	@RequestMapping("/totimeline")
	public ModelAndView toTimeline(ModelAndView mv) {

		// 获取置顶文章
		List<Btmt> btmts = blogService.findAgrees();
		mv.addObject("btmts", btmts);

		List<BtmtTimeline> list = blogService.findTimeline();

		mv.addObject("list", list);
		mv.setViewName("blog/timeline");
		return mv;
	}
}

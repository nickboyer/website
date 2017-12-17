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

import java.io.IOException;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.entry.BtmtTimeline;
import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.service.IAdminService;
import cn.nickboyer.website.api.service.IBlogDataService;
import cn.nickboyer.website.api.service.ISutService;
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

	@Reference
	private ISutService sutService;

	/**
	 * 跳转到登录页面
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午12:26:58
	 */
	@RequestMapping("/tologin")
	public ModelAndView toLogin(ModelAndView mv) {

		mv.setViewName("user/login");
		mv.addObject("msg", "");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}

	/**
	 * 登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws IOException
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月11日 下午11:48:40
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/login")
	@ResponseBody
	public Object login(@RequestParam("username") String username, @RequestParam("password") String password) throws IOException {

		ReturnInfo<Sut> ri = adminService.login(username, password);
		if (ri.getObj() == null) {

			return ri;
		}
		// 登录
		Sut user = ri.getObj();
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPwd());
		subject.getSession().setAttribute("user", user);
		subject.login(token);
		ri.setAction("/index");
		return ri;
	}

	/**
	 * 退出
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月13日 下午1:56:11
	 */
	@RequestMapping("/logout")
	public String logout() {
		SecurityUtils.getSubject().logout();
		return "user/login";
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
	public ModelAndView toRegister(ModelAndView mv) {

		mv.setViewName("user/reg");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}

	/**
	 * @param username
	 * @param password
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月13日 下午1:42:37
	 */
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
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;

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
	@RequestMapping("/homes")
	public ModelAndView userDetailByName(ModelAndView mv, @RequestParam("username") String username) {

		// 获取用户最近发表的博客 10篇
		List<Btmt> list = blogService.findUserLastedByName(username);
		mv.addObject("list", list);
		mv.setViewName("user/home");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
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
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}
}

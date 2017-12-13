/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月7日 下午2:48:44
 */
package cn.nickboyer.website.blog.controller.common;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.nickboyer.website.api.common.PageData;
import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.service.IBlogDataService;
import cn.nickboyer.website.blog.controller.BaseComponent;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Controller
public class IndexController extends BaseComponent {

	@Reference
	private IBlogDataService blogService;

	/**
	 * 首页
	 * 
	 * @param mv
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月7日 下午2:50:33
	 */
	@RequestMapping("/index")
	public ModelAndView index(ModelAndView mv) {

		// 获取置顶博客
		List<Btmt> agrees = blogService.findAgrees();
		mv.addObject("agrees", agrees);

		PageData page = new PageData();
		page.put("orderBy", "1");
		page.put("order", "1");
		page.put("pageNum", "1");
		page.put("pageSize", "6");
		// 获取文章列表
		List<Btmt> list = blogService.findList(new Btmt(), page);
		mv.addObject("list", list);
		mv.setViewName("index");
		mv.addObject("user", SecurityUtils.getSubject().getSession().getAttribute("user"));
		return mv;
	}
}

/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月29日 下午3:04:46
 */
package cn.nickboyer.website.blog.controller.blog;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("/blog")
public class BlogController extends BaseComponent {

	@Reference
	private IBlogDataService blogService;

	@RequestMapping("/index")
	public ModelAndView index(ModelAndView mv) {

		// 获取博客
		PageData page = new PageData();
		page.put("orderBy", "1");
		page.put("order", "1");
		page.put("pageNum", "1");
		page.put("pageSize", "6");
		// 获取文章列表
		List<Btmt> list = blogService.findList(new Btmt(), page);
		mv.addObject("list", list);
		mv.setViewName("blog/index");
		return mv;
	}

	/**
	 * 详细页面
	 * 
	 * @param mv
	 * @param id
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午9:55:04
	 */
	@RequestMapping("/detail")
	public ModelAndView detail(ModelAndView mv, @RequestParam("id") String id) {

		// 获取置顶文章
		List<Btmt> list = blogService.findAgrees();
		mv.addObject("list", list);

		// 获取详情文章
		Btmt info = blogService.findById(id);
		mv.addObject("info", info);
		mv.setViewName("blog/detail");
		return mv;
	}

	/**
	 * 跳转新增页面
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午9:56:03
	 */
	@RequestMapping("/toadd")
	public String toAdd() {

		return "blog/add";
	}

}

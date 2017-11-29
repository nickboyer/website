/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月29日 下午3:04:46
 */
package cn.nickboyer.website.web.controller.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.service.IBlogDataService;
import cn.nickboyer.website.web.controller.BaseComponent;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Controller
@RequestMapping("/blog")
public class BlogController extends BaseComponent {

	@Autowired
	private IBlogDataService blogService;

	@RequestMapping("/index")
	public ModelAndView index(ModelAndView mv) {

		// 获取最热门文章
		Btmt hottest = blogService.findHottest();
		mv.addObject("hottest", hottest);

		mv.setViewName("blog/index");
		return mv;
	}

	// @RequestMapping("/index")
	// public ModelAndView index(Btmt info, PageData page, ModelAndView mv) {
	//
	// // 获取最热门文章
	// Btmt hottest = blogService.findHottest();
	// mv.addObject("hottest", hottest);
	//
	// // 获取文章列表
	// List<Btmt> list = blogService.findList(info, page);
	// mv.addObject("list", list);
	//
	// mv.setViewName("blog/index");
	// return mv;
	// }
}

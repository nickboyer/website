/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月16日 下午6:18:02
 */
package cn.nickboyer.website.blog.controller.blog;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.nickboyer.website.api.common.ReturnInfo;
import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.entry.Uct;
import cn.nickboyer.website.api.service.IBlogDataService;
import cn.nickboyer.website.api.service.ICommentService;
import cn.nickboyer.website.blog.controller.BaseComponent;

/**
 * @title
 * @description
 * @since JDK1.8
 */
@Controller
@RequestMapping("/uct")
public class CommentController extends BaseComponent {

	@Reference
	private ICommentService commentService;

	@Reference
	private IBlogDataService blogService;

	@RequestMapping("/reply")
	@ResponseBody
	public Object reply(Uct info) {

		ReturnInfo<String> ri = new ReturnInfo<>();
		commentService.reply(info, (Sut) SecurityUtils.getSubject().getSession().getAttribute("user"));
		ri.setAction("/blog/detail?id=" + info.getRelid());
		return ri;
	}
}

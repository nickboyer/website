/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月9日 下午6:21:40
 */
package cn.nickboyer.website.blog.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 错误处理器
 * 
 * @title
 * @description
 * @since JDK1.8
 */
@Controller
public class ErrController implements ErrorController {

	private static final String ERROR_PATH = "/error";

	@RequestMapping(value = ERROR_PATH)
	public String handleError() {

		return "other/404";
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.springframework.boot.autoconfigure.web.ErrorController#getErrorPath()
	 */
	@Override
	public String getErrorPath() {

		return ERROR_PATH;
	}
}

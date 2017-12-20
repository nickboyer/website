/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月20日 下午9:02:50
 */
package cn.nickboyer.website.blog.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.core.annotation.Order;

/**
 * @title
 * @description
 * @since JDK1.8
 */
@Order(1)
@WebFilter(filterName = "sessionFilter", urlPatterns = "/*")
public class SessionFilter implements Filter {

	/*
	 * （非 Javadoc）
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO 自动生成方法存根
		System.out.println("=========================================================================================");
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		if (!SecurityUtils.getSubject().isAuthenticated()) {

			if ("XMLHttpRequest".equals(httpServletRequest.getHeader("X-Requested-With")) && !httpServletRequest.getServletPath().equals("/user/login")) {
				httpServletResponse.setHeader("status", "1");
				return;
			}
		}

		chain.doFilter(request, response);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO 自动生成方法存根

	}

}

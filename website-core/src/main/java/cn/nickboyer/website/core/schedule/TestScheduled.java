/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午2:56:56
 */
package cn.nickboyer.website.core.schedule;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
// @Component
public class TestScheduled {

	// @Autowired
	// private IBlogDataService service;

	@Scheduled(fixedDelay = 10000)
	public void execute() {

		// PageInfo<Test> selectAll = service.selectAll();
		//
		// System.out.println(selectAll);
	}
}

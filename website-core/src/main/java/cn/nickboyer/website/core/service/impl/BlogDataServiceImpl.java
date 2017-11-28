/*
 * Copyright 2015 nickboyer.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年11月28日 下午1:31:42
 */
package cn.nickboyer.website.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nickboyer.website.api.entry.Btmt;
import cn.nickboyer.website.api.service.IBlogDataService;
import cn.nickboyer.website.core.common.service.BaseService;
import cn.nickboyer.website.core.repository.BtmtMapper;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Service
public class BlogDataServiceImpl extends BaseService implements IBlogDataService {

	@Autowired
	private BtmtMapper btmtMapper;

	/*
	 * （no Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.IBlogDataService#addBlog(cn.nickboyer.website.api.entry.Btmt)
	 */
	@Override
	public int addBlog(Btmt info) {

		return 0;
	}

}

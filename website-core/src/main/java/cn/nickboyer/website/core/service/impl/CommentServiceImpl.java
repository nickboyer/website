/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月16日 下午7:35:31
 */
package cn.nickboyer.website.core.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.entry.Uct;
import cn.nickboyer.website.api.service.ICommentService;
import cn.nickboyer.website.core.common.service.BaseService;
import cn.nickboyer.website.core.repository.BtmtMapper;
import cn.nickboyer.website.core.repository.UctMapper;

/**
 * @title
 * @description
 * @since JDK1.8
 */
@Component
@Service
public class CommentServiceImpl extends BaseService implements ICommentService {

	@Autowired
	private UctMapper uctMapper;

	@Autowired
	private BtmtMapper btmtMapper;

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.ICommentService#reply(cn.nickboyer.website.api.entry.Uct, cn.nickboyer.website.api.entry.Sut)
	 */
	@Override
	public void reply(Uct info, Sut user) {
		info.setUserid(user.getId());
		info.setUsername(user.getUsername());
		info.setUserImg(user.getUserImg());
		info.setCreateTime(new Date());
		uctMapper.insert(info);

		btmtMapper.updateComment(info.getRelid());

	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see cn.nickboyer.website.api.service.ICommentService#findAllCommentByRelid(java.lang.Integer)
	 */
	@Override
	public List<Uct> findAllCommentByRelid(Integer id) {

		return uctMapper.selectCommentByRelid(id);
	}

}

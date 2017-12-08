/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月7日 下午9:57:53
 */
package cn.nickboyer.website.blog.shiro;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.service.ISutService;

/**
 * @title
 * @description
 * @since JDK1.8
 */
public class MyShiroRealm extends AuthorizingRealm {

	@Reference
	private ISutService sutService;

	public MyShiroRealm(CacheManager cacheManager, CredentialsMatcher matcher) {
		super(cacheManager, matcher);
	}

	/**
	 * 
	 */
	public MyShiroRealm() {
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection paramPrincipalCollection) {
		// SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		// LoginUser user = (LoginUser) SecurityUtils.getSubject().getSession().getAttribute(AuthAppConfig.LOGIN_USER);
		// if (user != null) {
		// // 当前用户角色编码集合
		// List<String> roleIds = new ArrayList<>();
		//
		// for (LoginUserRole role : userService.findLoginUserRoles(user)) {
		// roleIds.add(String.valueOf(role.getId()));
		// }
		// authorizationInfo.addRoles(roleIds);
		//
		// // TODO add permits
		// // authorizationInfo.addStringPermissions(null);
		//
		// }
		// return authorizationInfo;
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		UserAuthenticationToken token = (UserAuthenticationToken) authenticationToken;

		if (StringUtils.isEmpty(token.getUsername()) || StringUtils.isEmpty(token.getPassword())) {

			throw new AccountException("username or password is empty");
		}
		Sut user = sutService.findByName(token.getUsername());
		if (user == null) { // 用户不存在
			throw new AccountException("The user does not exist");
		}
		return new SimpleAuthenticationInfo(user.getUsername(), user.getPwd(), getName());
	}
}
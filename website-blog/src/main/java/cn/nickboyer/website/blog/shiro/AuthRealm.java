/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月12日 下午10:40:48
 */
package cn.nickboyer.website.blog.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.nickboyer.website.api.entry.Sut;
import cn.nickboyer.website.api.service.ISutService;

/**
 * @title
 * @description
 * @since JDK1.8
 */
public class AuthRealm extends AuthorizingRealm {

	@Autowired
	private ISutService sutService;

	// 认证.登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken utoken = (UsernamePasswordToken) token;// 获取用户输入的token
		String username = utoken.getUsername();
		Sut sut = sutService.findByName(username);
		return new SimpleAuthenticationInfo(sut, sut.getPwd(), this.getClass().getName());// 放入shiro.调用CredentialsMatcher检验密码
	}

	// 授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		// User user = (User) principal.fromRealm(this.getClass().getName()).iterator().next();// 获取session中的用户

		// List<String> permissions = new ArrayList<>();
		// Set<Role> roles = user.getRoles();
		// if (roles.size() > 0) {
		// for (Role role : roles) {
		// Set<Module> modules = role.getModules();
		// if (modules.size() > 0) {
		// for (Module module : modules) {
		// permissions.add(module.getMname());
		// }
		// }
		// }
		// }
		// SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// info.addStringPermissions(permissions);// 将权限放入shiro中.
		// return info;
		return null;
	}

}
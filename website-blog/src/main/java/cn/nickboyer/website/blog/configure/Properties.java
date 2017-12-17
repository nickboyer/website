/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年8月29日 下午1:36:50
 */
package cn.nickboyer.website.blog.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "nickboyer", ignoreUnknownFields = true)
public class Properties {

	private final Sftp sftp = new Sftp();

	/**
	 * @return sftp
	 */
	public Sftp getSftp() {
		return sftp;
	}

	public static class Sftp {

		private String host;

		private int port;

		private String user;

		private String pwd;

		private String prefix;

		private String basePath;

		private int timeout;

		/**
		 * @return host
		 */
		public String getHost() {
			return host;
		}

		/**
		 * @param host 要设置的 host
		 */
		public void setHost(String host) {
			this.host = host;
		}

		/**
		 * @return port
		 */
		public int getPort() {
			return port;
		}

		/**
		 * @param port 要设置的 port
		 */
		public void setPort(int port) {
			this.port = port;
		}

		/**
		 * @return timeout
		 */
		public int getTimeout() {
			return timeout;
		}

		/**
		 * @param timeout 要设置的 timeout
		 */
		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}

		/**
		 * @return user
		 */
		public String getUser() {
			return user;
		}

		/**
		 * @param user 要设置的 user
		 */
		public void setUser(String user) {
			this.user = user;
		}

		/**
		 * @return pwd
		 */
		public String getPwd() {
			return pwd;
		}

		/**
		 * @param pwd 要设置的 pwd
		 */
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		/**
		 * @return prefix
		 */
		public String getPrefix() {
			return prefix;
		}

		/**
		 * @param prefix 要设置的 prefix
		 */
		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		/**
		 * @return basePath
		 */
		public String getBasePath() {
			return basePath;
		}

		/**
		 * @param basePath 要设置的 basePath
		 */
		public void setBasePath(String basePath) {
			this.basePath = basePath;
		}

	}
}

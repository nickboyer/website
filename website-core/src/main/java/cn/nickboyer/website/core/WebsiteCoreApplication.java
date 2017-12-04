package cn.nickboyer.website.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class WebsiteCoreApplication {

	/**
	 * @param args
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月1日 下午3:11:35
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebsiteCoreApplication.class, args);
	}
}

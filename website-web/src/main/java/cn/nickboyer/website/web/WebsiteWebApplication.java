package cn.nickboyer.website.web;

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
public class WebsiteWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteWebApplication.class, args);
	}
}

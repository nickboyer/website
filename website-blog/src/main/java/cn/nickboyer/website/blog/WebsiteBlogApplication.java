package cn.nickboyer.website.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
@ServletComponentScan
public class WebsiteBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteBlogApplication.class, args);
	}
}

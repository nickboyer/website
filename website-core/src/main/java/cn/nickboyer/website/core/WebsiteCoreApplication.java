package cn.nickboyer.website.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class WebsiteCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteCoreApplication.class, args);
	}
}

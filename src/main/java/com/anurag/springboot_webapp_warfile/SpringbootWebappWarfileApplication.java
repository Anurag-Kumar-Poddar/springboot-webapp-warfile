package com.anurag.springboot_webapp_warfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootWebappWarfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebappWarfileApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "<h1>wlcome to tomcat!</h1>";
	}

}

package com.atos.eduhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan
public class EduHubApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EduHubApplication.class, args);
	}
	

	@RequestMapping(value="/")
	public String hello() {
		return "<h1> Hello All </h1>";
	}
}

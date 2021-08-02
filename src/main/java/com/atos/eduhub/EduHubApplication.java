package com.atos.eduhub;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan({ "com.atos.eduhub.controller", "com.atos.eduhub.service", "com.atos.eduhub.model",
		"com.atos.eduhub.dao" })
public class EduHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduHubApplication.class, args);
		System.out.println("LocalDateTime : " + LocalDateTime.now());
		System.out.println("Timestamp 	  : " + Timestamp.valueOf(LocalDateTime.now()));
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "<h1> Hello All </h1>";
	}
}

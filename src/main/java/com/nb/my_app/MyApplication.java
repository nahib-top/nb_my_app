package com.nb.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyApplication {

	@RequestMapping("/")
	String home(){
		return "Hello my-app-project!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
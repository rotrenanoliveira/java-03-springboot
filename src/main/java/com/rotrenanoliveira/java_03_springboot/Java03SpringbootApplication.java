package com.rotrenanoliveira.java_03_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rotrenanoliveira")
public class Java03SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java03SpringbootApplication.class, args);
	}
}

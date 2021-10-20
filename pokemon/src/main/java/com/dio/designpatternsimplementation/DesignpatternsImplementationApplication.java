package com.dio.designpatternsimplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesignpatternsImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsImplementationApplication.class, args);
	}

}

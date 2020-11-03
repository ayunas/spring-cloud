package com.udemy.bharath.productservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductserviceApplication {

	@Value("${server.port")
	private static String port;

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
		System.out.println("Product Microservice Up and Running on port : " + port);
	}

}

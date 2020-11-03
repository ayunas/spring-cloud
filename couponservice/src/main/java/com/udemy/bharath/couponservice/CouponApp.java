package com.udemy.bharath.couponservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouponApp {

	public static void main(String[] args) {
		SpringApplication.run(CouponApp.class, args);
		System.out.println("spring cloud works!");
	}

}

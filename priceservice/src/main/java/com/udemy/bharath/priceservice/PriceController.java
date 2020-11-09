package com.udemy.bharath.priceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prices")
public class PriceController {

	@Autowired
	iPriceRepo priceRepo;

//	Get Prices
	@GetMapping
	public List<Price> getPrices() {
		return priceRepo.findAll();
	}


//	Get One Price



//	Add a Price



}

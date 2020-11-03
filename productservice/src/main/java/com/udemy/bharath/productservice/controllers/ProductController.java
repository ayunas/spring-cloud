package com.udemy.bharath.productservice.controllers;

import com.udemy.bharath.productservice.dao.ProductRepo;
import com.udemy.bharath.productservice.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	ProductRepo productRepo;

	@GetMapping
	public Iterable<Product> getProducts() {
		System.out.println("in getProducts()");
		Iterable<Product> products = productRepo.findAll();
		products.forEach(p -> System.out.println(p));
		return products;
	}

	@GetMapping("/{name}")
	public Product getProductByName(@PathVariable String name) {
		return productRepo.findByName(name);
	}

	@PostMapping
	public Product addProduct(@RequestBody Product prod) {
		return productRepo.save(prod);
	}

}

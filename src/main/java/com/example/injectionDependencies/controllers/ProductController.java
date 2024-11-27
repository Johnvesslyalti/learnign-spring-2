package com.example.injectionDependencies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.injectionDependencies.services.ProductServices;

@RequestMapping("/products/")
@RestController
@CrossOrigin("*")
public class ProductController {
	@Autowired
	public ProductServices productServices;
	
	@GetMapping("addproducts")
	public String addProducts() {
		return productServices.addProducts();
	}
	@GetMapping("updateproducts")
		public String updateProducts() {
		return productServices.updateProducts();
	}
	@GetMapping("deleteproducts")
		public String deleteProducts() {
		return productServices.deleteProducts();
	}
}

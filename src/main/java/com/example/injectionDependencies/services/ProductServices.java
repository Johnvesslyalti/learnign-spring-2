package com.example.injectionDependencies.services;

import org.springframework.stereotype.Service;

@Service
public class ProductServices {
	public String addProducts() {
		return "Products added successfully";
	}
	public String updateProducts() {
		return "Products updated successfully";
	}
	public String deleteProducts() {
		return "Products deleted successfully";
	}
}

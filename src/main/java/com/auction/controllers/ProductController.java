package com.auction.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.auction.entities.Product;
import com.auction.services.ProductService;
@RestController
public class ProductController {
	@Autowired
ProductService productService;
	void addProduct(int productId, String productName, String productDescription, String productStatus ) {
		
	}
	void update(int productId, String productName, String productDescription, String productStatus) {
		
	}
	
}

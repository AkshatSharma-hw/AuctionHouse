package com.auction.services;

import java.util.*;

import com.auction.entities.Product;


/**
 * @author Prachi Gaikwad, Avani Kala
 * @version 1.0
 * @creation_date 8th Oct 2019 2.45PM
 * @modification_date 8th Oct 2019 7.45PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Business Service Interface.
 * 				It is used in Business Layer of Application.
 *    
 */



public interface ProductService {

	
	void addProduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	Product findProductByProductId(int productId);
	Product findProductByProductName(String productName);
	List<Product> findAllProducts();
		
}

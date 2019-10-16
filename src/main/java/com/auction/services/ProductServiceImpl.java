package com.auction.services;

import java.util.List;

import com.auction.daos.ProductDao;
import com.auction.entities.Product;

/**
 * @author Prachi Gaikwad
 * @version 1.0
 * @creation_date 8th Oct 2019 2.55PM
 * @modification_date 8th Oct 2019 2.55PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Business Service Interface Implementation.
 * 				It is used in Business Layer of Application.
 *    
 */

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}

	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);
	}

	public Product findProductByProductId(int productId) {
		// TODO Auto-generated method stub
		Product product= productDao.getByProductId(productId);
		return product;
	}

	
	public Product findProductByProductName(String productName) {
		// TODO Auto-generated method stub
		Product product= productDao.getByProductName(productName);
		return product;
	}
	

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	
	}

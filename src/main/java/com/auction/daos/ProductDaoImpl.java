package com.auction.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.auction.entities.Category;
import com.auction.entities.Product;
import com.auction.entities.ProductImage;
import com.auction.entities.Seller;

/**
 * @author Prachi Gaikwad, Avani Kala
 * @version 1.0
 * @creation_date 7th Oct 2019 6.46PM
 * @modification_date 8th Oct 2019 09:18PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Product Data Access Object Interface Implementation.
 * 
 */
@Repository
public class ProductDaoImpl implements ProductDao  {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}

	public Product getByProductId(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	public Product getByProductName(String productName) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productName);
		}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return (List<Product>) hibernateTemplate.find("from product");
	}

	public List<Product> getAllByCategory(String categoryName) {
		// TODO Auto-generated method stub
		return (List<Product>) hibernateTemplate.get(Product.class, categoryName);
	}

	public void uploadimage(ProductImage productImage) {
		// TODO Auto-generated method stub
		
	}
	
}

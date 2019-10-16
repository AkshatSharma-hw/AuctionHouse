package com.auction.daos;

import java.util.List;
import com.auction.entities.Product;
import com.auction.entities.ProductImage;
import com.auction.entities.Seller;

	/**
	 * @author Prachi Gaikwad, Avani Kala
	 * @version 1.0
	 * @creation_date 7th Oct 2019 6.46PM
	 * @modification_date 7th Oct 2019 6.46PM
	 * @copyright Zensar Technologies. All rights reserved.
	 * @description It is Data Access Object Interface.
	 * 				It is used in Persistence Layer of Application.
	 *    
	 */



	public interface ProductDao {
		void insert(Product product);
		void update(Product product);
		void delete(Product product);
		Product getByProductId(int productId);
		Product getByProductName(String productName);
		List<Product> getAll();
		List<Product> getAllByCategory(String categoryName);
		void uploadimage(ProductImage productImage);
		}
		


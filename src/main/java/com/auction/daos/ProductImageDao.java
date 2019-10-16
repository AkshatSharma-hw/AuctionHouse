package com.auction.daos;
/**
 * @author Mansi Hiremath
 * @creation_date 13 October,2019 7:45 PM
 * @modification_date 13 October,2019 7:45 PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a DAO interface
 *
 */

import java.io.File;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import com.auction.entities.Product;
import com.auction.entities.ProductImage;

public interface ProductImageDao  {
	String insertImage(MultipartFile[] files);
	void deleteImage(ProductImage productImage);
	List<ProductImage> getImageLocation();
	
	 //getAllImages(ProductImage productImage);
}

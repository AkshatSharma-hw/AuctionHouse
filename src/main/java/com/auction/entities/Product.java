package com.auction.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

/**
 * @author Mansi Hiremath
 * @creation_date 3 October,2019 7:38 PM
 * @modification_date 5 October,2019 7:38 PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a POJO class
 *
 */
@Component
@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productDescription;
	private String productStatus;
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	@OneToOne
	@JoinColumn(name = "sellerId")
	private Seller seller;
	@OneToOne
	@JoinColumn(name = "buyerId")
	private Buyer buyer;
	@OneToMany(mappedBy = "product")
	private List<ProductImage> productImage;
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public List<ProductImage> getProductImage() {
		return productImage;
	}

	public void setProductImage(List<ProductImage> productImage) {
		this.productImage = productImage;
	}

	

	
	
	
	

}

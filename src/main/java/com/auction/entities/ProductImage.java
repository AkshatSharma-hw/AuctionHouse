package com.auction.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;
@Component
@Entity
public class ProductImage {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int productImageId;
@ManyToOne
@JoinColumn(name = "productId")
private Product product;
private String imageLocation;
public int getProductImageId() {
	return productImageId;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public String getImageLocation() {
	return imageLocation;
}
public void setImageLocation(String imageLocation) {
	this.imageLocation = imageLocation;
}


}

package com.auction.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Category {
@Id
private String categoryId;
private String categoryName;
private String categoryDescription;
@OneToMany(mappedBy = "category")
private List<Product> product;
public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDescription() {
	return categoryDescription;
}
public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
}
public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
			+ categoryDescription + ", product=" + product + "]";
}


}

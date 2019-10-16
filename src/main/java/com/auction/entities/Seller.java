package com.auction.entities;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

/**
 * @author Mansi Hiremath
 * @creation_date 3 October,2019 7:38 PM
 * @modification_date 3 October,2019 7:38 PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a POJO class
 *
 */
@Component
@Entity
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sellerId;
	@Column(nullable = false)
	private LocalDate sellingDate;
	private LocalTime uploadingTime;
	private float expectedPrice;
	@Column(nullable = false)
	private float basePrice;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@OneToOne(mappedBy = "seller")
	private Product product;
	
	
	
	public LocalTime getUploadingTime() {
		return uploadingTime;
	}
	public void setUploadingTime(LocalTime uploadingTime) {
		this.uploadingTime = uploadingTime;
	}
	
	public int getSellerId() {
		return sellerId;
	}
	public LocalDate getSellingDate() {
		return sellingDate;
	}
	public void setSellingDate(LocalDate sellingDate) {
		this.sellingDate = sellingDate;
	}
	public float getExpectedPrice() {
		return expectedPrice;
	}
	public void setExpectedPrice(float expectedPrice) {
		this.expectedPrice = expectedPrice;
	}
	public float getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
		@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellingDate=" + sellingDate + ", expectedPrice=" + expectedPrice
				+ ", basePrice=" + basePrice + ", customer=" + customer + ", product=" + product + "]";
	}

	

}

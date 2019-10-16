package com.auction.entities;

import java.time.LocalDate;
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
 * @author Garvita Jain
 * @creation_date 4 October,2019 7:51 PM
 * @modification_date 4 October,2019 7:51 PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a POJO class
 *
 */
@Component
@Entity
public class Buyer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int buyerId;
	@Column(nullable = false)
	private LocalDate buyingDate;
	@Column(nullable = false)
	private float buyingPrice;
	@OneToOne(mappedBy = "buyer")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	public LocalDate getBuyingDate() {
		return buyingDate;
	}
	public void setBuyingDate(LocalDate buyingDate) {
		this.buyingDate = buyingDate;
	}
	public float getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(float buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public int getBuyerId() {
		return buyerId;
	}
	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", buyingDate=" + buyingDate + ", buyingPrice=" + buyingPrice
				+ ", product=" + product + ", customer=" + customer + "]";
	}

	
}

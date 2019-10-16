package com.auction.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

/**
 * @author Mansi Hiremath
 * @creation_date 3 October,2019 7:50 PM
 * @modification_date 3 October,2019 7:50 PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a POJO class
 *
 */
@Component
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private long customerMobNumber;
	private String customerEmailId;
	private String customerPassword;
	@OneToMany(mappedBy = "customer")
	private List<Seller> seller;

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerMobNumber() {
		return customerMobNumber;
	}

	public void setCustomerMobNumber(long customerMobNumber) {
		this.customerMobNumber = customerMobNumber;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public List<Seller> getSeller() {
		return seller;
	}

	public void setSeller(List<Seller> seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobNumber="
				+ customerMobNumber + ", customerEmailId=" + customerEmailId + ", customerPassword=" + customerPassword
				+ ", seller=" + seller + "]";
	}

}

package com.auction.main;

import java.time.LocalDate;
import java.time.LocalTime;

import com.auction.entities.Customer;
import com.auction.entities.Seller;

public class HibernateMain {
	public static void main(String[] args) {
		
		Customer cust=new Customer();
		cust.setCustomerName("Mansi");
		cust.setCustomerPassword("mansi");
		cust.setCustomerMobNumber(7040288458L);
		cust.setCustomerEmailId("mansi@gmail.com");
		
		Seller s1=new Seller();
		s1.setSellingDate(LocalDate.of(2019,03,21));
		s1.setBasePrice(20000);
	s1.setUploadingTime(LocalTime.of(04, 30, 30));
	s1.setCustomer(cust);
	
	
	
}
}
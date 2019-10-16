package com.auction.services;

import java.util.List;

import com.auction.entities.Customer;

public interface CustomerService {
void addCustomer(Customer customer);
void updateCustomer(Customer customer);
void removeCustomer(Customer customer);
List<Customer> getAllCustomers();
Customer getCustomerByCustomerName(String customerName);
Customer getCustomerByCustomerEmailId(String customerEmailId);

}

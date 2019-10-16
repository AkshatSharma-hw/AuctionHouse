package com.auction.daos;

import java.util.List;

import com.auction.entities.Customer;

public interface CustomerDao {
void insert(Customer customer);
void update(Customer customer);
void delete(Customer customer);
List<Customer> getAll();
Customer getByCustomerName(String customerName);
Customer getByCustomerEmailId(String customerEmailId);
}

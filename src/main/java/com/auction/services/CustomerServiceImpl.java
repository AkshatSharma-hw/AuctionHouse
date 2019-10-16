package com.auction.services;

import java.util.List;

import com.auction.daos.CustomerDao;
import com.auction.entities.Customer;

public class CustomerServiceImpl implements CustomerService {
private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
	this.customerDao = customerDao;
}

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
customerDao.insert(customer);
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
customerDao.update(customer);
	}

	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
customerDao.delete(customer);
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAll();
	}

	public Customer getCustomerByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		Customer customer=customerDao.getByCustomerName(customerName);
		return customer;
	}

	public Customer getCustomerByCustomerEmailId(String customerEmailId) {
		// TODO Auto-generated method stub
		Customer customer=customerDao.getByCustomerEmailId(customerEmailId);
		return customer;
	}

}

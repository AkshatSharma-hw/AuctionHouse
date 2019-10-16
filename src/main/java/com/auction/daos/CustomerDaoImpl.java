package com.auction.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.auction.entities.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {
@Autowired
	private HibernateTemplate hibernateTemplate;
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(customer);
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(customer);
	}

	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(customer);
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return (List<Customer>) hibernateTemplate.find("from customer");
	}

	public Customer getByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Customer.class, customerName);

	}

	public Customer getByCustomerEmailId(String customerEmailId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Customer.class, customerEmailId);
	}

}

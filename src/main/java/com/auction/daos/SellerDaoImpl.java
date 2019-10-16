package com.auction.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.auction.entities.Seller;
@Repository
public class SellerDaoImpl implements SellerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void insert(Seller seller) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(seller);
	}

	public void update(Seller seller) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(seller);
	}

	public void delete(Seller seller) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(seller);
	}

	public List<Seller> getAll() {
		// TODO Auto-generated method stub
		return (List<Seller>) hibernateTemplate.find("from Seller");
	}

	public Seller getBySellerId(int sellerId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Seller.class, sellerId);
	}
	

}

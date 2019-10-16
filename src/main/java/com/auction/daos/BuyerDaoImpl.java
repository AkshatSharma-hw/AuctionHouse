package com.auction.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.auction.entities.Buyer;
@Repository
public class BuyerDaoImpl implements BuyerDao {
@Autowired
	private HibernateTemplate hibernateTemplate;
	public void insert(Buyer buyer) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(buyer);
	}

	public void update(Buyer buyer) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(buyer);;

	}

	public void delete(Buyer buyer) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(buyer);
	}

	public List<Buyer> getAll() {
		// TODO Auto-generated method stub
		return (List<Buyer>) hibernateTemplate.find("from buyer");
	}

	public Buyer getByBuyerId(int buyerId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Buyer.class, buyerId);
	}
	

}

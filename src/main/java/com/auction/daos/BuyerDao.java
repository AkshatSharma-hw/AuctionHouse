package com.auction.daos;

import java.util.List;

import com.auction.entities.Buyer;
import com.auction.entities.Seller;

public interface BuyerDao {
	void insert(Buyer buyer);
	void update(Buyer buyer);
	void delete(Buyer buyer);
	List<Buyer> getAll();
	Buyer getByBuyerId(int buyerId);
	
}

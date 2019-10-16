package com.auction.daos;

import java.util.List;


import com.auction.entities.Seller;

public interface SellerDao {
	void insert(Seller seller);
	void update(Seller seller);
	void delete(Seller seller);
	List<Seller> getAll();
	Seller getBySellerId(int sellerId);
	
}

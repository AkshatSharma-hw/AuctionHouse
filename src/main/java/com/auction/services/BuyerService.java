package com.auction.services;

import java.util.List;

import com.auction.entities.Buyer;

public interface BuyerService {
	void addBuyer(Buyer buyer);
	void updateBuyer(Buyer buyer);
	void removeBuyer(Buyer buyer);
	List<Buyer> getAllBuyers();
	Buyer getBuyerByBuyerId(int buyerId);
	
}

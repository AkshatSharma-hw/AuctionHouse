package com.auction.services;

import java.util.List;
import com.auction.entities.Seller;

public interface SellerService {
	void addSeller(Seller seller);
	void updateSeller(Seller seller);
	void removeSeller(Seller seller);
	List<Seller> getAllSellers();
	Seller getSellerBySellerId(int sellerId);
	
}

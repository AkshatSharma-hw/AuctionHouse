package com.auction.services;

import java.util.List;

import com.auction.daos.SellerDao;
import com.auction.entities.Seller;

public class SellerServiceImpl implements SellerService {
SellerDao sellerDao;
	public void addSeller(Seller seller) {
		// TODO Auto-generated method stub
sellerDao.insert(seller);
	}

	public void updateSeller(Seller seller) {
		// TODO Auto-generated method stub
sellerDao.update(seller);
	}

	public void removeSeller(Seller seller) {
		// TODO Auto-generated method stub
sellerDao.delete(seller);
	}

	public List<Seller> getAllSellers() {
		// TODO Auto-generated method stub
		return sellerDao.getAll();
	}

	public Seller getSellerBySellerId(int sellerId) {
		// TODO Auto-generated method stub
		Seller seller=sellerDao.getBySellerId(sellerId);
		return seller;
	}

	

}

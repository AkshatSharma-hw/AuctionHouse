package com.auction.services;

import java.util.List;

import com.auction.daos.BuyerDao;
import com.auction.entities.Buyer;

public class BuyerServiceImpl implements BuyerService {
BuyerDao buyerDao;
	public void addBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
buyerDao.insert(buyer);
	}

	public void updateBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
buyerDao.update(buyer);
	}

	public void removeBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
buyerDao.delete(buyer);
	}

	public List<Buyer> getAllBuyers() {
		// TODO Auto-generated method stub
		return buyerDao.getAll();
	}

	public Buyer getBuyerByBuyerId(int buyerId) {
		// TODO Auto-generated method stub
		Buyer buyer=buyerDao.getByBuyerId(buyerId);
		return buyer;
	}

		}


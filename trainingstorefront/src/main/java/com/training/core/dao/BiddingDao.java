package com.training.core.dao;

import com.training.core.model.BiddingModel;

public interface BiddingDao {

	void createBidding(BiddingModel country);
	BiddingModel getBidding(Long id);
	BiddingModel getBiddingForCustomer(Long customerId);
	BiddingModel getBiddingForProduct(Long customerId);
	
}

package com.training.core.service;

import com.training.core.model.BiddingModel;

public interface BiddingService{

	void saveBidding(BiddingModel biddingModel);
	BiddingModel getBidding(Long id);
	BiddingModel getBiddingForCustomer(Long customerId); 
	BiddingModel getBiddingForProduct(Long productId);
}

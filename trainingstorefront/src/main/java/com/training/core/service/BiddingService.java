package com.training.core.service;

import java.util.List;

import com.training.core.model.BiddingModel;

public interface BiddingService 
{
	void saveBidding(BiddingModel bidding);
	BiddingModel getBiddingById(Long biddingId);
	List<BiddingModel> getBiddingsByProduct(Long productId);
	List<BiddingModel> getCustomerBiddings(Long customerId);
	List<BiddingModel> getProductBiddings(Long productId);
}

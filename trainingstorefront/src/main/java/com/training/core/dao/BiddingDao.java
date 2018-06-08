package com.training.core.dao;

import java.util.List;

import com.training.core.model.BiddingModel;

public interface BiddingDao 
{
	void saveBidding(BiddingModel bidding);
	BiddingModel getBiddingById(Long biddingId);
	List<BiddingModel> getBiddingsByProduct(Long productId);
	List<BiddingModel> getBiddingsByCustomer(Long customerId);
}

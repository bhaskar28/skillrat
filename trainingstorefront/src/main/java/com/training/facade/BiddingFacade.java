package com.training.facade;

import java.util.List;

import com.training.core.data.BiddingData;

public interface BiddingFacade 
{
	BiddingData createBid(BiddingData biddingData);
	List<BiddingData> getCustomerBiddings(Long customerId);
	List<BiddingData> getProductBiddings(Long productId);
}

package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.training.core.dao.BiddingDao;
import com.training.core.model.BiddingModel;
import com.training.core.service.BiddingService;

@Service("biddingService")
public class DefaultBiddingService implements BiddingService{

	@Resource(name="biddingDao")
	private BiddingDao biddingDao;

	@Override
	@Transactional
	public void saveBidding(BiddingModel biddingModel) 
	{
		biddingDao.createBidding(biddingModel);
	}

	@Override
	public BiddingModel getBidding(Long id) 
	{
		return biddingDao.getBidding(id);
	}
	
	@Override
	public BiddingModel getBiddingForCustomer(Long customerId) 
	{
		return biddingDao.getBiddingForCustomer(customerId);
	}
	
	@Override
	public BiddingModel getBiddingForProduct(Long productId) 
	{
		return biddingDao.getBiddingForProduct(productId);
	}
	
}

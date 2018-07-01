package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.core.dao.BiddingDao;
import com.training.core.model.BiddingModel;
import com.training.core.service.BiddingService;

@Service("biddingService")
public class DefaultBiddingService implements BiddingService
{
	@Resource(name="biddingDao")
	private BiddingDao biddingDao;
	
	@Override
	@Transactional
	public void saveBidding(BiddingModel bidding) 
	{
		biddingDao.saveBidding(bidding);
	}

	@Override
	@Transactional
	public BiddingModel getBiddingById(Long biddingId) 
	{
		return biddingDao.getBiddingById(biddingId);
	}

	@Override
	@Transactional
	public List<BiddingModel> getBiddingsByProduct(Long productId) 
	{
		return biddingDao.getBiddingsByProduct(productId);
	}

	@Override
	@Transactional
	public List<BiddingModel> getCustomerBiddings(Long customerId) 
	{
		return biddingDao.getBiddingsByCustomer(customerId);
	}

	@Override
	@Transactional
	public List<BiddingModel> getProductBiddings(Long productId) 
	{
		return biddingDao.getBiddingsByProduct(productId);
	}

}
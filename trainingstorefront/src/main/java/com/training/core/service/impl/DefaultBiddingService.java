package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.training.core.dao.BiddingDao;
import com.training.core.model.BiddingModel;
import com.training.core.service.BiddingService;

@Service("biddingService")
public class DefaultBiddingService implements BiddingService
{
	@Resource(name="biddingDao")
	private BiddingDao biddingDao;
	
	@Override
	public void saveBidding(BiddingModel bidding) 
	{
		biddingDao.saveBidding(bidding);
	}

	@Override
	public BiddingModel getBiddingById(Long biddingId) 
	{
		return biddingDao.getBiddingById(biddingId);
	}

	@Override
	public List<BiddingModel> getBiddingsByProduct(Long productId) 
	{
		return null;
	}

}

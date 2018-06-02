package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.BiddingDao;
import com.training.core.model.BiddingModel;

@Repository("biddingDao")
public class DefaultBiddingDao implements BiddingDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void saveBidding(BiddingModel bidding) 
	{
		sessionFactory.getCurrentSession().save(bidding);
	}

	@Override
	public BiddingModel getBiddingById(Long biddingId) 
	{
		return (BiddingModel) sessionFactory.getCurrentSession().get(BiddingModel.class, biddingId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BiddingModel> getBiddingsByProduct(Long productId) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.BiddingModel.class.getName()+" "
				+ "WHERE product.id =:productId");
		query.setParameter("productId", productId);
		
		return query.list();
	}
	
}

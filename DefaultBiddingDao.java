package com.training.core.dao.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.training.core.dao.BiddingDao;
import com.training.core.model.BiddingModel;
import com.training.core.model.CountryModel;
import com.training.core.model.ExperienceModel;

@Repository("BiddingDao")
public class DefaultBiddingDao implements BiddingDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createBidding(BiddingModel bidding) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(bidding);
	}

	@Override
	public BiddingModel getBidding(Long id) {
		return (BiddingModel) sessionFactory.getCurrentSession().get(BiddingModel.class, id);
	}

	@Override
	@Transactional
	public BiddingModel getBiddingForCustomer(Long customerId) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.BiddingModel.class.getName()+" "
				+ "WHERE customer.id= :customerId");
		query.setParameter("customerId", customerId);
		
		if(query.list() != null)
		{
			query.list().get(0);
		}
		return null;
	}
	
	@Override
	@Transactional
	public BiddingModel getBiddingForProduct(Long productId) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.BiddingModel.class.getName()+" "
				+ "WHERE product.id= :productId");
		query.setParameter("productId", productId);
		
		if(query.list() != null)
		{
			query.list().get(0);
		}
		return null;
	}
	
}
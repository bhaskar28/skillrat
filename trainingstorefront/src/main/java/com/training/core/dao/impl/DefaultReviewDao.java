package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.ReviewDao;
import com.training.core.model.ReviewModel;

@Repository("reviewDao")
public class DefaultReviewDao implements ReviewDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void saveReview(ReviewModel reviewModel) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(reviewModel);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ReviewModel> getCustomerReviews(Long customerId) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.ReviewModel.class.getName()+" "
				+ " WHERE customer.id =:customerId");
		return query.list();
	}

}

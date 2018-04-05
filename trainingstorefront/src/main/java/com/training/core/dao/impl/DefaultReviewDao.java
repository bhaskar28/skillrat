package com.training.core.dao.impl;

import org.hibernate.SessionFactory;

import com.training.core.dao.ReviewDao;
import com.training.core.model.ReviewModel;

public class DefaultReviewDao implements ReviewDao
{
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void saveReview(ReviewModel reviewModel) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(reviewModel);
	}

}

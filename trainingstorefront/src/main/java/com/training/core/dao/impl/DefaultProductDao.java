package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.ProductDao;
import com.training.core.model.ProductModel;

// This anotation will be used to identify a dao class (DAO= Data access object. That means we will interact with 
// database by using this object)
@Repository("productDao")
public class DefaultProductDao implements ProductDao
{
	// sessionFactory is a database connection factory name.which is configured in xml file.
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void createProduct(ProductModel productModel) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(productModel);
	}

}

package com.training.core.customer.dao.impl;
import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.customer.dao.CustomerDao;
import com.training.core.model.CustomerModel;

@Repository("customerDao")
public class DefaultCustomerDao implements CustomerDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUser(CustomerModel customerModel) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(customerModel);
	}

	@Override
	public CustomerModel getCustomerById(Long id) 
	{
		return (CustomerModel) sessionFactory.getCurrentSession().get(CustomerModel.class, id);
	}

}

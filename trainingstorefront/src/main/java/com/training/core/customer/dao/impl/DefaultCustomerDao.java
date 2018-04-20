package com.training.core.customer.dao.impl;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

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

	@Override
	public CustomerModel getCustomerByUserName(String username) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.CustomerModel.class.getName()+" "
				+ " where mobile =:username");
		query.setParameter("username", username);
		
		if(null == query || CollectionUtils.isEmpty(query.list()))
		{
			return null;
		}
		return (CustomerModel) query.list().get(0);
	}

}

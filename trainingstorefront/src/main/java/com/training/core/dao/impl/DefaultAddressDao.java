package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.AddressDao;
import com.training.core.model.AddressModel;
@Repository("addressDao")
public class DefaultAddressDao implements AddressDao
{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createAddress(AddressModel address) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate( address);
	}

	@Override
	public AddressModel getAddressById(Long id) 
	{
		return (AddressModel) sessionFactory.getCurrentSession().get(AddressModel.class, id);
	}

}

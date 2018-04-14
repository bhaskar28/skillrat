package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.BusinessUnitDao;
import com.training.core.model.BusinessUnitModel;



@Repository("businessDao")
public class DefaultBusinessUnitDao implements BusinessUnitDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createBusinessUnit(BusinessUnitModel business) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate( business);
	}

	@Override
	public BusinessUnitModel getBusinessUnit(Long id) 
	{
		return (BusinessUnitModel) sessionFactory.getCurrentSession().get(BusinessUnitModel.class, id);
	}

}


	
package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.BusinessUnitDao;
import com.training.core.model.BusinessUnitModel;



@Repository("businessDao")
public class DefaultBusinessUnitDao implements BusinessUnitDao{

	// sessionFactory is a database connection factory name.which is configured in xml file.
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createBusinessUnit(BusinessUnitModel business) {
		sessionFactory.getCurrentSession().saveOrUpdate( business);
	}

}


	
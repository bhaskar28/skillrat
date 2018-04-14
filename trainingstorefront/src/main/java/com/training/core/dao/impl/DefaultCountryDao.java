package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CountryDao;
import com.training.core.model.CountryModel;

@Repository("countryDao")
public class DefaultCountryDao implements CountryDao 
{
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createCountry(CountryModel country) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(country);
	}

	@Override
	public CountryModel getCountry(Long id) 
	{
		return (CountryModel) sessionFactory.getCurrentSession().get(CountryModel.class, id);
	}

}
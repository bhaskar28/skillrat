package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CityDao;
import com.training.core.model.CityModel;

@Repository("cityDao")
public class DefaultCityDao implements CityDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void saveOrupdate(CityModel city) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(city);
	}

	@Override
	public List<CityModel> getCitiesForCountryId(Long id) 
	{
		return null;
	}

	@Override
	public List<CityModel> getAllCitiesForCountryId(Long id) 
	{
		return null;
	}

}

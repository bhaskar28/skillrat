package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<CityModel> getAllCitiesForRegion(Long regionCode) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.CityModel.class.getName()+" "
				+ " where region.id= :id");
		query.setParameter("id", regionCode);
		return query.list();
	}

}

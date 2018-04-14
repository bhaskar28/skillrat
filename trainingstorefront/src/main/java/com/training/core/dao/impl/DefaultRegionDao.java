package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.training.core.dao.RegionDao;
import com.training.core.model.RegionModel;


@Repository("regionDao")
public class DefaultRegionDao implements RegionDao 
{
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createRegion(RegionModel region) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(region);
	}

	@Override
	public RegionModel getRegionById(Long id) 
	{
		return (RegionModel) sessionFactory.getCurrentSession().get(RegionModel.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegionModel> getRegionsForCountry(Long countryId) 
	{
		Query query= sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.RegionModel.class.getName()+" "
				+ "where country.id =:countryId");
		query.setParameter("countryId", countryId);
		return query.list();
	}

}

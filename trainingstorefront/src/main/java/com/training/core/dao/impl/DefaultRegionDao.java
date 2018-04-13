package com.training.core.dao.impl;

import javax.annotation.Resource;
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

}

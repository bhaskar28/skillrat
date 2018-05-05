package com.training.core.dao.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.training.core.dao.ExperienceDao;
import com.training.core.model.ExperienceModel;

@Repository("experienceDao")
public class DefaultExperienceDao implements ExperienceDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createExperience(ExperienceModel experience) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(experience);
	}

	@Override
	@Transactional
	public ExperienceModel getExperienceForCustomer(Long customerId) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.ExperienceModel.class.getName()+" "
				+ "WHERE customer.id= :customerId");
		query.setParameter("customerId", customerId);
		
		if(query.list() != null)
		{
			query.list().get(0);
		}
		return null;
	}
}

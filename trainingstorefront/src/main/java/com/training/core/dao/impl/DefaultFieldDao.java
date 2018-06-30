package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.FieldDao;
import com.training.core.model.FieldModel;

@Repository("fieldDao")
public class DefaultFieldDao implements FieldDao
{
	// sessionFactory is a database connection factory name.which is configured in xml file.
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createField(FieldModel field) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate( field);
	}

	@Override
	public FieldModel getFieldById(Long id) 
	{
		return (FieldModel) sessionFactory.getCurrentSession().get(FieldModel.class, id);
	}
}

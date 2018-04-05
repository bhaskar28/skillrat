package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CategoryDao;
import com.training.core.model.CategoryModel;
@Repository("categoryDao")
public class DefaultCategoryDao implements CategoryDao
{
	// sessionFactory is a database connection factory name.which is configured in xml file.
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createCategory(CategoryModel category) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate( category);
	}

}

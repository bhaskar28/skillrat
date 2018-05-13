package com.training.core.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<CategoryModel> getCategories() 
	{
		Query query= sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.CategoryModel.class.getName());
		
		if(null == query || CollectionUtils.isEmpty(query.list()))
		{
			return Collections.EMPTY_LIST;
		}
		return query.list();
	}

}

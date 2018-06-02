package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CategoryDao;
import com.training.core.model.CategoryModel;
import com.training.core.query.data.CategoryQueryData;
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
	public List<CategoryModel> getRootCategories() 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.CategoryModel.class.getName()+" "
				+ "WHERE hasSuperCategories :=false");
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CategoryModel> getRootCategories(CategoryQueryData categoryQuery) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.CategoryModel.class.getName()+" "
				+ "WHERE hasSuperCategories :=false");
		query.setFirstResult((categoryQuery.getPage()-1)*categoryQuery.getPageSize());
		query.setMaxResults(categoryQuery.getPageSize());
		return query.list();
	}

	@Override
	public CategoryModel getCategoryById(Long categoryId) 
	{
		return (CategoryModel) sessionFactory.getCurrentSession().get(CategoryModel.class, categoryId);
	}

}

package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.ProductDao;
import com.training.core.model.ProductModel;
import com.training.core.query.data.ProductQueryData;

@Repository("productDao")
public class DefaultProductDao implements ProductDao
{
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void createProduct(ProductModel productModel) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(productModel);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getProductsByCustomer(Long customerId) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.ProductModel.class.getName()+" "
				+ "WHERE owner.id =:customerId");
		query.setParameter("customerId", customerId);
		return query.list();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getProductsByCustomer(ProductQueryData productQuery) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.ProductModel.class.getName()+" "
				+ "WHERE owner.id =:customerId");
		query.setParameter("customerId", productQuery.getCustomerId());
		query.setMaxResults(productQuery.getPageSize());
		query.setFirstResult((productQuery.getPage()-1)*productQuery.getPageSize());
		return query.list();
	}


	@Override
	public ProductModel getProductById(Long productId) 
	{
		return (ProductModel) sessionFactory.getCurrentSession().get(ProductModel.class, productId);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getProducts(ProductQueryData productQuery) 
	{
		StringBuilder sqlQuery=new StringBuilder("FROM "+com.training.core.model.ProductModel.class.getName());
		
		if(null !=productQuery.getFieldId())
		{
			sqlQuery.append(" WHERE field.id =:fieldId");
		}
		sqlQuery.append(" ORDER BY creationTime DESC");
		
		Query query=sessionFactory.getCurrentSession().createQuery(sqlQuery.toString());
		query.setMaxResults(productQuery.getPageSize());
		query.setFirstResult((productQuery.getPage()-1)*productQuery.getPageSize());
		return query.list();
	}

}

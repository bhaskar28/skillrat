package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.PriceRowDao;
import com.training.core.model.PriceRowModel;

@Repository("priceRowDao")
public class DefaultPriceRowDao implements PriceRowDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void createPrice(PriceRowModel priceRow) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(priceRow);
	}

	@Override
	public PriceRowModel getPriceRow(Long id) 
	{
		return (PriceRowModel) sessionFactory.getCurrentSession().get(PriceRowModel.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<PriceRowModel> getAllPriceRows()
	{
		Query query= sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.PriceRowModel.class.getName());
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<PriceRowModel> getPriceRowForCurrency(Long currencyId)
	{
		Query query= sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.PriceRowModel.class.getName()+" "
				+ "WHERE currency.id= :currencyId");
		query.setParameter("currencyId", currencyId);
		return query.list();
	}
}

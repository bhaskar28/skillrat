package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.training.core.dao.CurrencyDao;
import com.training.core.model.CurrencyModel;

@Repository("currencyDao")
public class DefaultCurrencyDao implements CurrencyDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void createCurrency(CurrencyModel currency) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(currency);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CurrencyModel> getCurrencies() 
	{
		Query query= sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.CurrencyModel.class.getName());
		return query.list();
	}

	@Override
	public CurrencyModel getCurrencyByISOCode(String isoCode) 
	{
		Query query= sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.CurrencyModel.class.getName()+" "
				+ "WHERE isoCode= :isoCode");
		
		query.setParameter("isoCode", isoCode);
		
		if(query != null || !CollectionUtils.isEmpty(query.list()))
		{
			query.list().get(0);
		}
		return null;
	}
}

package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.core.dao.CurrencyDao;
import com.training.core.model.CurrencyModel;
import com.training.core.service.CurrencyService;

@Service("currencyService")
public class DefaultCurrencyService implements CurrencyService
{
	@Resource(name="currencyDao")
	private CurrencyDao currencyDao;
	
	@Override
	@Transactional
	public void createCurrency(CurrencyModel currency) 
	{
		currencyDao.createCurrency(currency);
	}

	@Override
	@Transactional
	public List<CurrencyModel> getCurrencies() 
	{
		return currencyDao.getCurrencies();
	}

	@Override
	@Transactional
	public CurrencyModel getCurrencyByISOCode(String isoCode) 
	{
		return currencyDao.getCurrencyByISOCode(isoCode);
	}
	
}

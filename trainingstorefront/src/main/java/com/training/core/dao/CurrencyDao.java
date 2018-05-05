package com.training.core.dao;

import java.util.List;

import com.training.core.model.CurrencyModel;

public interface CurrencyDao 
{
	void createCurrency(CurrencyModel currency); 
	List<CurrencyModel> getCurrencies();
	CurrencyModel getCurrencyByISOCode(String isoCode);
}

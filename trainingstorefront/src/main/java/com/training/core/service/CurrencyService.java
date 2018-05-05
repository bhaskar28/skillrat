package com.training.core.service;

import java.util.List;

import com.training.core.model.CurrencyModel;

public interface CurrencyService 
{
	void createCurrency(CurrencyModel currency); 
	List<CurrencyModel> getCurrencies();
	CurrencyModel getCurrencyByISOCode(String isoCode);
}

package com.training.storefront.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.CurrencyData;
import com.training.core.model.CurrencyModel;
import com.training.core.service.CurrencyService;

@Controller
@RequestMapping("/currency")
public class CurrencyController 
{
	@Resource(name="currencyService")
	private CurrencyService currencyService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	@ResponseBody
	public void createCurrency(CurrencyData currencyData)
	{
		CurrencyModel currencyModel= new CurrencyModel();
		currencyModel.setIsoCode(currencyData.getIsoCode());
		currencyModel.setName(currencyData.getName());
		currencyService.createCurrency(currencyModel);
	}
	
	@RequestMapping(value="/list", produces="application/json")
	@ResponseBody
	public List<CurrencyData> getAllCurrencies()
	{
		List<CurrencyModel> currencies=currencyService.getCurrencies();
		List<CurrencyData> currencyList= new ArrayList<CurrencyData>();
		for(CurrencyModel currency: currencies)
		{
			CurrencyData currencyData= new CurrencyData();
			currencyData.setIsoCode(currency.getIsoCode());
			currencyData.setName(currency.getName());
			currencyList.add(currencyData);
		}
		return currencyList;
	}
	
	@RequestMapping(value="/iso", produces="application/json")
	@ResponseBody
	public CurrencyData getCurrencyByIsoCode(String isoCode)
	{
		CurrencyModel currency=currencyService.getCurrencyByISOCode(isoCode);
		CurrencyData currencyData= new CurrencyData();
		currencyData.setId(currency.getId());
		currencyData.setIsoCode(currency.getIsoCode());
		currencyData.setName(currency.getName());
		return currencyData;
	}
}

package com.training.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.PriceRowData;
import com.training.core.model.CurrencyModel;
import com.training.core.model.PriceRowModel;
import com.training.core.service.CurrencyService;
import com.training.core.service.PriceRowService;
import com.training.facade.PriceRowFacade;

@Component("priceRowFacade")
public class DefaultPriceRowFacade implements PriceRowFacade
{
	@Resource(name="priceRowService")
	private PriceRowService priceRowService;
	
	@Resource(name="currencyService")
	private CurrencyService currencyService;
	
	@Override
	public PriceRowData getPriceRowById(Long priceRowId) 
	{
		PriceRowModel priceRow=priceRowService.getPriceRow(priceRowId);
		PriceRowData priceRowData= new PriceRowData();
		priceRowData.setCurrencyCode(priceRow.getCurrency().getIsoCode());
		priceRowData.setFixedPrice(priceRow.getFixedPrice());
		priceRowData.setMaximum(priceRow.getMaximumPrice());
		priceRowData.setMinimum(priceRow.getMinimumPrice());
		priceRowData.setId(priceRow.getId());
		return priceRowData;
	}

	@Override
	public PriceRowModel createPriceRow(PriceRowData priceRowData) 
	{
		CurrencyModel currencyModel=currencyService.getCurrencyByISOCode(priceRowData.getCurrencyCode());
		PriceRowModel priceRow= new PriceRowModel();
		priceRow.setFixedPrice(priceRowData.getFixedPrice());
		priceRow.setMaximumPrice(priceRowData.getMaximum());
		priceRow.setMinimumPrice(priceRowData.getMinimum());
		priceRow.setCurrency(currencyModel);
		priceRowService.createPrice(priceRow);
		return priceRow;
	}

}

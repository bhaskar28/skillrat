package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.core.data.PriceRowData;
import com.training.core.model.PriceRowModel;
import com.training.core.service.CurrencyService;
import com.training.core.service.PriceRowService;

@Controller
@RequestMapping("/price")
public class PriceRowController 
{
	@Resource(name="priceRowService")
	private PriceRowService priceRowService;
	
	@Resource(name="currencyService")
	private CurrencyService currencyService;
	
	public void createPrice(PriceRowData priceRow)
	{
		PriceRowModel priceRowModel= new PriceRowModel();
		priceRowModel.setFixedPrice(priceRow.getFixedPrice());
		priceRowModel.setMaximumPrice(priceRow.getMaximum());
		priceRowModel.setMinimumPrice(priceRow.getMinimum());
		priceRowModel.setCurrency(currencyService.getCurrencyByISOCode(priceRow.getCurrencyCode()));
		priceRowService.createPrice(priceRowModel);
	}
}

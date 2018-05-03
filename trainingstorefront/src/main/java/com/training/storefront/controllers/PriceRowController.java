package com.training.storefront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.core.data.PriceRowData;
import com.training.core.model.PriceRowModel;

@Controller
@RequestMapping("/price")
public class PriceRowController 
{
	public void createPrice(PriceRowData priceRow)
	{
		PriceRowModel priceRowModel= new PriceRowModel();
		priceRowModel.setFixedPrice(priceRow.getFixedPrice());
		priceRowModel.setMaximumPrice(priceRow.getMaximum());
		priceRowModel.setMinimumPrice(priceRow.getMinimum());
	}
}

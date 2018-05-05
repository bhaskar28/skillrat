package com.training.core.service;

import java.util.List;

import com.training.core.model.PriceRowModel;

public interface PriceRowService 
{
	void createPrice(PriceRowModel priceRow);
	PriceRowModel getPriceRow(Long id);
	List<PriceRowModel> getPriceRowForCurrency(Long currencyId);
}

package com.training.core.dao;

import java.util.List;

import com.training.core.model.PriceRowModel;

public interface PriceRowDao 
{
	void createPrice(PriceRowModel priceRow);
	PriceRowModel getPriceRow(Long id);
	List<PriceRowModel> getPriceRowForCurrency(Long currencyId);
}

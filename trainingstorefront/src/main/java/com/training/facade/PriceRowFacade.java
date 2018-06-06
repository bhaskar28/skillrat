package com.training.facade;

import com.training.core.data.PriceRowData;
import com.training.core.model.PriceRowModel;

public interface PriceRowFacade 
{
	PriceRowData getPriceRowById(Long priceRowId);
	PriceRowModel createPriceRow(PriceRowData priceRowData);
}

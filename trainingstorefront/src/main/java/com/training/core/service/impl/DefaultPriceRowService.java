package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.core.dao.PriceRowDao;
import com.training.core.model.PriceRowModel;
import com.training.core.service.PriceRowService;

@Service("priceRowService")
public class DefaultPriceRowService implements PriceRowService
{
	@Resource(name="priceRowDao")
	private PriceRowDao priceRowDao;
	
	@Override
	@Transactional
	public void createPrice(PriceRowModel priceRow) 
	{
		priceRowDao.createPrice(priceRow);
	}

	@Override
	@Transactional
	public PriceRowModel getPriceRow(Long id) 
	{
		return priceRowDao.getPriceRow(id);
	}

	@Override
	@Transactional
	public List<PriceRowModel> getPriceRowForCurrency(Long currencyId) 
	{
		return priceRowDao.getPriceRowForCurrency(currencyId);
	}
}

package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.BusinessUnitDao;
import com.training.core.model.BusinessUnitModel;
import com.training.core.service.BusinessService;

@Service("businessService")
public class DefaultBusinessUnitService implements BusinessService
{
	@Resource(name="businessDao")
	private BusinessUnitDao businessUnitDao;

	@Override
	@Transactional
	public void saveBusiness(BusinessUnitModel businessModel) 
	{
		businessUnitDao.createBusinessUnit(businessModel);
	}

	@Override
	public BusinessUnitModel getBusinessUnit(Long id) 
	{
		return businessUnitDao.getBusinessUnit(id);
	}
	
}
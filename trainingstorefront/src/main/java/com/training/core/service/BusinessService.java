package com.training.core.service;


import com.training.core.model.BusinessUnitModel;

public interface BusinessService 
{
	void saveBusiness(BusinessUnitModel businessModel);
	BusinessUnitModel getBusinessUnit(Long id);
}

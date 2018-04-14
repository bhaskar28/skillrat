package com.training.core.dao;


import com.training.core.model.BusinessUnitModel;

public interface BusinessUnitDao 
{
	void createBusinessUnit(BusinessUnitModel business);
	BusinessUnitModel getBusinessUnit(Long id);
}

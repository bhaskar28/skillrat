package com.training.core.dao;

import com.training.core.model.AddressModel;


public interface AddressDao 
{
	void createAddress(AddressModel address);
	AddressModel getAddressById(Long id);
}

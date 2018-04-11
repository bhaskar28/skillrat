package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.AddressDao;
import com.training.core.model.AddressModel;
import com.training.core.service.AddressService;

@Service("addressService")
public class DefaultAddressService implements AddressService{
	@Resource(name="addressDao")
	private AddressDao addressDao;

	@Override
	@Transactional
	public void saveAddress(AddressModel addressModel) {
		addressDao.createAddress(addressModel);
	}}
	

package com.training.storefront.controllers;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.AddressData;
import com.training.core.model.AddressModel;
import com.training.core.service.AddressService;

@Controller
@RequestMapping("/addr")
public class AddressController {
	
	@Resource(name="addressService")
	private AddressService addressService;
    
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createAddress(AddressData addressData)
	{
		System.out.println(addressData);
		AddressModel address= new AddressModel();
		address.setCountry(addressData.getCountry());
		address.setContact(addressData.getContact());
		address.setEmail(addressData.getEmail());
		address.setId(addressData.getId());
		address.setLine1(addressData.getLine1());
		address.setLine2(addressData.getLine2());
		address.setLine3(addressData.getLine3());
		address.setPincode(addressData.getPincode());
		address.setRegion(addressData.getRegion());
		addressService.saveAddress(address);
	}

}

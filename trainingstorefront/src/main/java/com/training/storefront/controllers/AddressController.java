package com.training.storefront.controllers;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.AddressData;
import com.training.core.model.AddressModel;
import com.training.core.model.BusinessUnitModel;
import com.training.core.model.CountryModel;
import com.training.core.model.CustomerModel;
import com.training.core.model.RegionModel;
import com.training.core.service.AddressService;
import com.training.core.service.BusinessService;
import com.training.core.service.CountryService;
import com.training.core.service.CustomerService;
import com.training.core.service.RegionService;

@Controller
@RequestMapping("/address")
public class AddressController 
{
	@Resource(name="addressService")
	private AddressService addressService;
    
	@Resource(name="regionService")
	private RegionService regionService;
	
	@Resource(name="countryService")
	private CountryService countryService;
	
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="customerService")
	private BusinessService businessService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createAddress(AddressData addressData)
	{
		RegionModel region=regionService.getRegionById(addressData.getRegionId());
		CountryModel country=countryService.getCountry(addressData.getCountryId());
		System.out.println(addressData);
		AddressModel address= new AddressModel();
		address.setContact(addressData.getContact());
		address.setEmail(addressData.getEmail());
		address.setId(addressData.getId());
		address.setLine1(addressData.getLine1());
		address.setLine2(addressData.getLine2());
		address.setLine3(addressData.getLine3());
		address.setPincode(addressData.getPincode());
		address.setRegion(region);
		address.setCountry(country);
		addressService.saveAddress(address);
	}
	
	@RequestMapping(value="/customer", method= RequestMethod.POST)
	@ResponseBody
	public void createForCustomer(AddressData addressData, Long customerId)
	{
		CustomerModel customer=customerService.getCustomerById(customerId);
		RegionModel region=regionService.getRegionById(addressData.getRegionId());
		CountryModel country=countryService.getCountry(addressData.getCountryId());
		
		AddressModel address= new AddressModel();
		address.setContact(addressData.getContact());
		address.setEmail(addressData.getEmail());
		address.setId(addressData.getId());
		address.setLine1(addressData.getLine1());
		address.setLine2(addressData.getLine2());
		address.setLine3(addressData.getLine3());
		address.setPincode(addressData.getPincode());
		address.setRegion(region);
		address.setCountry(country);
		addressService.saveAddress(address);
		
		if(customer.getAddresses()== null && CollectionUtils.isEmpty(customer.getAddresses()))
		{
			Set<AddressModel> addresses= new HashSet<AddressModel>();
			addresses.add(address);
			customer.setAddresses(addresses);
		}
		else
		{
			Set<AddressModel> addresses=customer.getAddresses();
			addresses.add(address);
		}
		customerService.saveCustomer(customer);
	}
	
	@RequestMapping(value="/business", method= RequestMethod.POST)
	@ResponseBody
	public void createForBusiness(AddressData addressData, Long businessId)
	{
		BusinessUnitModel businessUnit=businessService.getBusinessUnit(businessId);
		
		RegionModel region=regionService.getRegionById(addressData.getRegionId());
		CountryModel country=countryService.getCountry(addressData.getCountryId());
		
		AddressModel address= new AddressModel();
		address.setContact(addressData.getContact());
		address.setEmail(addressData.getEmail());
		address.setId(addressData.getId());
		address.setLine1(addressData.getLine1());
		address.setLine2(addressData.getLine2());
		address.setLine3(addressData.getLine3());
		address.setPincode(addressData.getPincode());
		address.setRegion(region);
		address.setCountry(country);
		addressService.saveAddress(address);
		
		if(businessUnit.getAddresses()== null && CollectionUtils.isEmpty(businessUnit.getAddresses()))
		{
			Set<AddressModel> addresses= new HashSet<AddressModel>();
			addresses.add(address);
			businessUnit.setAddresses(addresses);
		}
		else
		{
			Set<AddressModel> addresses=businessUnit.getAddresses();
			addresses.add(address);
		}
	}

}

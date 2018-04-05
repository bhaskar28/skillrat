package com.training.storefront.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.Column;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.CustomerData;
import com.training.core.data.FieldData;
import com.training.core.model.CustomerModel;
import com.training.core.model.FieldModel;
import com.training.core.service.CustomerService;
import com.training.core.service.FieldService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Resource(name="customerService")
	private CustomerService customerService;
    
	@Resource(name="fieldService")
	private FieldService fieldService; 
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createCustomer(CustomerData customerData)
	{
		System.out.println(customerData);
		CustomerModel  customer= new CustomerModel ();
		customer.setFirstName(customerData.getFirstName());
		customer.setLastName(customerData.getLastName()) ;
		customer.setMobile(customerData.getMobile()); 
		customer.setEmail(customerData.getEmail()); 
		customer.setPassword(customerData.getPassword());
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		customer.setCreationTime(date);

		customerService.saveCustomer(customer);
	}
	
	@RequestMapping(value="/add-fields", method= RequestMethod.POST)
	@ResponseBody
	public void addFields(Long[] fieldid, Long customerId)
	{
		CustomerModel customer=customerService.getCustomerById(customerId);
		Set<FieldModel> fieldsList= new HashSet<FieldModel>();
		for(Long filedData: fieldid)
		{
			FieldModel fieldModel=fieldService.getFieldById(filedData);
			fieldsList.add(fieldModel);
		}
		customer.setFields(fieldsList);
		customerService.saveCustomer(customer);
	}
}

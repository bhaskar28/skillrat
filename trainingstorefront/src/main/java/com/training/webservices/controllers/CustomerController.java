package com.training.webservices.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.training.core.data.CustomerData;
import com.training.core.model.CustomerModel;
import com.training.core.model.FieldModel;
import com.training.core.response.data.CustomerResponseData;
import com.training.core.service.CustomerService;
import com.training.core.service.FieldService;
import com.training.storefront.validators.CustomerValidator;

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
		CustomerResponseData customerResponse= new CustomerResponseData();
		
		if(CustomerValidator.validate(customerData) != null)
		{
			customerResponse.setMessage(CustomerValidator.validate(customerData));
			customerResponse.setResonseCode(300);
		}
		
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
		
		Set<FieldModel> fieldsList= customer.getFields();
		
		if(fieldsList == null)
		{
			fieldsList= new HashSet<FieldModel>();
		}
		else
		{
			for(Long filedData: fieldid)
			{
				FieldModel fieldModel=fieldService.getFieldById(filedData);
				fieldsList.add(fieldModel);
			}
		}
		
		customer.setFields(fieldsList);
		customerService.saveCustomer(customer);
	}
	
	@RequestMapping(value="/{id}", produces="application/json")
	@ResponseBody
	public CustomerData getCustomerById(@PathVariable("id") Long id)
	{
		CustomerModel customer=customerService.getCustomerById(id);
		CustomerData customerData= new CustomerData();
		customerData.setEmail(customer.getEmail());
		customerData.setFirstName(customer.getFirstName());
		customerData.setLastName(customer.getLastName());
		customerData.setMobile(customer.getMobile());
		customerData.setPassword(customer.getPassword());
		customerData.setId(customer.getId());
		return customerData;
	}
}

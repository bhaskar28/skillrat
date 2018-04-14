package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.training.core.data.EMployeeData;
import com.training.core.model.EmployeeModel;
import com.training.core.service.EmployeeService;

@Controller
@RequestMapping("/employe")
public class EmployeeController 
{
	@Resource(name="employeeService")
	private EmployeeService employeeService;
    
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createEmployee(EMployeeData employeeData)
	{
		System.out.println(employeeData);
		EmployeeModel employee= new EmployeeModel();
		employee.setEmail(employeeData.getEmail());
		employee.setFirstName(employeeData.getFirstName());
		employee.setLastName(employeeData.getLastName());
		employee.setPassword(employeeData.getPassword());
		employee.setId(employeeData.getId());
		employeeService.saveEmployee(employee);
	}

}

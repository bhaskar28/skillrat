package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.EmployeeDao;
import com.training.core.model.EmployeeModel;
import com.training.core.service.EmployeeService;

@Service("employeeService")
public class DefaultEmployeeService implements EmployeeService
{
	@Resource(name="employeeDao")
	private EmployeeDao employeeDao;

	@Override
	@Transactional
	public void saveEmployee(EmployeeModel employeeModel) 
	{
		employeeDao.createEmployee(employeeModel);
	}
	
}

package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


import com.training.core.dao.EmployeeDao;
import com.training.core.model.EmployeeModel;
@Repository("employeeDao")
public class DefaultEmployeeDao implements EmployeeDao{
	// sessionFactory is a database connection factory name.which is configured in xml file.
		@Resource(name="sessionFactory")
		private SessionFactory sessionFactory;

		@Override
		public void createEmployee(EmployeeModel employee) {
			sessionFactory.getCurrentSession().saveOrUpdate( employee);
		}

}

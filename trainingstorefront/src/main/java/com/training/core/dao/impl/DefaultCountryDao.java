package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CountryDao;
import com.training.core.model.CountryModel;

@Repository("countryDao")
public class DefaultCountryDao implements CountryDao{
	// sessionFactory is a database connection factory name.which is configured in xml file.
		@Resource(name="sessionFactory")
		private SessionFactory sessionFactory;

		@Override
		public void createCountry(CountryModel country) {
			sessionFactory.getCurrentSession().saveOrUpdate( country);
		}

}
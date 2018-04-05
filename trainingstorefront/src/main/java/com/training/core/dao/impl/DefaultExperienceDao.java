package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.ExperienceDao;
import com.training.core.model.ExperienceModel;

@Repository("experienceDao")

public class DefaultExperienceDao implements ExperienceDao
{
	// sessionFactory is a database connection factory name.which is configured in xml file.
		@Resource(name="sessionFactory")
		private SessionFactory sessionFactory;

		@Override
		public void createExperience(ExperienceModel experience) {

			sessionFactory.getCurrentSession().saveOrUpdate( experience);
		
			
		}
}

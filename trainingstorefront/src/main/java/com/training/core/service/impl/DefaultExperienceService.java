package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.customer.dao.CustomerDao;
import com.training.core.dao.ExperienceDao;
import com.training.core.model.CustomerModel;
import com.training.core.model.ExperienceModel;
import com.training.core.service.CustomerService;
import com.training.core.service.ExperienceService;
@Service("experienceService")
public class DefaultExperienceService implements ExperienceService{
	
	
		@Resource(name="experienceDao")
		private ExperienceDao experienceDao;
		

		@Override
		@Transactional
		public void saveExperience(ExperienceModel experienceModel) {
			experienceDao.createExperience( experienceModel);
			
		}
}

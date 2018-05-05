package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.training.core.dao.ExperienceDao;
import com.training.core.model.ExperienceModel;
import com.training.core.service.ExperienceService;
@Service("experienceService")
public class DefaultExperienceService implements ExperienceService
{
	
	@Resource(name="experienceDao")
	private ExperienceDao experienceDao;
		

	@Override
	@Transactional
	@CacheEvict(value="experienceCache", key="#id")
	public void saveExperience(ExperienceModel experienceModel) 
	{
		experienceDao.createExperience( experienceModel);
	}


	@Override
	@Cacheable(value="experienceCache", key="#id")
	public ExperienceModel getExperienceForCustomer(Long customerId) 
	{
		return experienceDao.getExperienceForCustomer(customerId);
	}
}

package com.training.core.service;
import com.training.core.model.ExperienceModel;

public interface ExperienceService 
{
	void saveExperience(ExperienceModel experienceModel);
	public ExperienceModel getExperienceForCustomer(Long customerId);
}

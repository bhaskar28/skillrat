package com.training.core.dao;

import com.training.core.model.ExperienceModel;

public interface ExperienceDao 
{
	void createExperience(ExperienceModel experience);
	ExperienceModel getExperienceForCustomer(Long customerId);
}

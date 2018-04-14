package com.training.core.dao;

import com.training.core.model.CountryModel;

public interface CountryDao 
{
	void createCountry(CountryModel country);
	CountryModel getCountry(Long id);
}

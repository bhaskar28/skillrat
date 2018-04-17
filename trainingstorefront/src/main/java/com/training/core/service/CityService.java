package com.training.core.service;

import java.util.List;

import com.training.core.model.CityModel;

public interface CityService 
{
	void saveOrupdate(CityModel city);
	List<CityModel> getCitiesForCountryId(Long id);
	List<CityModel> getAllCitiesForCountryId(Long id);
}

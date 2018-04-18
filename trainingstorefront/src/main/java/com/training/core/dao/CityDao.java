package com.training.core.dao;

import java.util.List;

import com.training.core.model.CityModel;

public interface CityDao 
{
	void saveOrupdate(CityModel city);
	List<CityModel> getAllCitiesForRegion(Long regionCode);
}

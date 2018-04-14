package com.training.core.service;

import java.util.List;

import com.training.core.model.RegionModel;

public interface RegionService 
{
	void saveRegion(RegionModel regionModel);
	RegionModel getRegionById(Long id);
	List<RegionModel> getRegionsForCountry(Long countryId);
}

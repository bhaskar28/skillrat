package com.training.core.dao;
import java.util.List;

import com.training.core.model.RegionModel;

public interface RegionDao 
{
	void createRegion(RegionModel region);
	RegionModel getRegionById(Long id);
	List<RegionModel> getRegionsForCountry(Long countryId);
}

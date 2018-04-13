package com.training.core.dao;
import com.training.core.model.RegionModel;

public interface RegionDao 
{
	void createRegion(RegionModel region);
	RegionModel getRegionById(Long id);
}

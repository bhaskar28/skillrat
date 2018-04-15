package com.training.core.response.data;

import java.util.List;

import com.training.core.data.RegionData;

public class RegionsResponse extends ResponseData
{
	private RegionData responseData;
	private List<RegionData> regions;
	public RegionData getResponseData() {
		return responseData;
	}
	public void setResponseData(RegionData responseData) {
		this.responseData = responseData;
	}
	public List<RegionData> getRegions() {
		return regions;
	}
	public void setRegions(List<RegionData> regions) {
		this.regions = regions;
	}
	
}

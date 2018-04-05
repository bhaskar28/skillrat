package com.training.core.data;

import java.util.List;

public class ExperienceData {
	private Long id;
	private Integer years;
	private Integer months;
	private String summary;
	  
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSummary() {
			return summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public Integer getYears() {
			return years;
		}
		public void setYears(Integer years) {
			this.years = years;
		}
		public Integer getMonths() {
			return years;
		}
		public void setMonths(Integer months) {
			this.months = months;
		}
}

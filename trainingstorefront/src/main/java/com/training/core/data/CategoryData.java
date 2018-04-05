package com.training.core.data;
public class CategoryData 
{
	private Long id;
	private String name;
	private String description;
	private Boolean hasSubCategories;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getHasSubCategories() {
		return hasSubCategories;
	}
	public void setHasSubCategories(Boolean hasSubCategories) {
		this.hasSubCategories = hasSubCategories;
	}
	@Override
	public String toString() {
		return "CategoryData [id=" + id + ", name=" + name + ", description=" + description + ", hasSubCategories="
				+ hasSubCategories + "]";
	}
	
}

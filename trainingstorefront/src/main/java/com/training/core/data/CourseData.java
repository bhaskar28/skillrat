package com.training.core.data;

import java.util.Date;

public class CourseData 
{
	private Long id;
	private String content;
	private Date createdDate;
	private Date modifiedDate;
	private Long categoryId;
	private String trainer;
	private String title;
	private FieldData fieldData;
	private Long fieldId;
	private Long customerId;
	private CategoryData categoryData;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public FieldData getFieldData() {
		return fieldData;
	}
	public void setFieldData(FieldData fieldData) {
		this.fieldData = fieldData;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public CategoryData getCategoryData() {
		return categoryData;
	}
	public void setCategoryData(CategoryData categoryData) {
		this.categoryData = categoryData;
	}
	public Long getFieldId() {
		return fieldId;
	}
	public void setFieldId(Long fieldId) {
		this.fieldId = fieldId;
	}
	
}

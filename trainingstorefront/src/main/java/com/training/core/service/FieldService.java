package com.training.core.service;

import java.util.List;

import com.training.core.model.FieldModel;

public interface FieldService 
{
	void saveField(FieldModel fieldModel);
	FieldModel getFieldById(Long id);
	List<FieldModel> getFieldsByCategory(Long categoryId);
}

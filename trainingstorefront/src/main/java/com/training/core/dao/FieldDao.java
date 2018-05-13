package com.training.core.dao;

import java.util.List;

import com.training.core.model.FieldModel;

public interface FieldDao 
{
	void createField(FieldModel field);
	FieldModel getFieldById(Long id);
	List<FieldModel> getFieldsByCategory(Long categoryId);
}
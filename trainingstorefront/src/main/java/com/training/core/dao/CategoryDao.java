package com.training.core.dao;

import java.util.List;

import com.training.core.model.CategoryModel;

public interface CategoryDao 
{
	void createCategory(CategoryModel category);
	List<CategoryModel> getCategories();
}

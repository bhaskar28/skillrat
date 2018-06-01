package com.training.core.dao;

import java.util.List;

import com.training.core.model.CategoryModel;
import com.training.core.query.data.CategoryQueryData;
public interface CategoryDao 
{
	void createCategory(CategoryModel category);
	List<CategoryModel> getRootCategories();
	List<CategoryModel> getRootCategories(CategoryQueryData categoryQuery);
}

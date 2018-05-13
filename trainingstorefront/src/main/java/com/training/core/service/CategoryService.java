package com.training.core.service;
import java.util.List;

import com.training.core.model.CategoryModel;

public interface CategoryService 
{
	void saveCategory(CategoryModel categoryModel);
	List<CategoryModel> getCategories();
}

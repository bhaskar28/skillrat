package com.training.core.service;
import java.util.List;

import com.training.core.model.CategoryModel;
import com.training.core.query.data.CategoryQueryData;

public interface CategoryService 
{
	void saveProduct(CategoryModel categoryModel);
	List<CategoryModel> getRootCategories();
	List<CategoryModel> getRootCategories(CategoryQueryData categoryQuery);
	CategoryModel getCategoryById(Long categoryId);
	List<CategoryModel> getSubCategories(Long categoryId);
}

package com.training.facade;

import java.util.List;

import com.training.core.data.CategoryData;
import com.training.core.query.data.CategoryQueryData;

public interface CategoryFacade 
{
	CategoryData getCategoryData(Long categoryId);
	List<CategoryData> getCategories(CategoryQueryData pagination);
	List<CategoryData> getCategories();
}

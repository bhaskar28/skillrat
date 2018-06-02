package com.training.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.CategoryData;
import com.training.core.model.CategoryModel;
import com.training.core.service.CategoryService;
import com.training.facade.CategoryFacade;

@Component("categoryFacade")
public class DefaultCategoryFacade implements CategoryFacade
{
	@Resource(name="categoryService")
	private CategoryService categoryService;
	
	@Override
	public CategoryData getCategoryData(Long categoryId) 
	{
		CategoryModel categoryModel=categoryService.getCategoryById(categoryId);
		CategoryData categoryData= new CategoryData();
		categoryData.setId(categoryModel.getId());
		categoryData.setHasSubCategories(categoryModel.getHasSubCategories());
		categoryData.setName(categoryModel.getName());
		categoryData.setHasSupCategories(categoryData.getHasSupCategories());
		return categoryData;
	}

}

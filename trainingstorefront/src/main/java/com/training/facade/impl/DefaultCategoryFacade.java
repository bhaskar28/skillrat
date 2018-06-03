package com.training.facade.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.CategoryData;
import com.training.core.model.CategoryModel;
import com.training.core.query.data.CategoryQueryData;
import com.training.core.service.CategoryService;
import com.training.facade.CategoryFacade;
import com.training.facade.MediaFacade;

@Component("categoryFacade")
public class DefaultCategoryFacade implements CategoryFacade
{
	@Resource(name="categoryService")
	private CategoryService categoryService;
	
	@Resource(name="mediaFacade")
	private MediaFacade mediaFacade;
	
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

	@Override
	public List<CategoryData> getCategories(CategoryQueryData pagination) 
	{
		List<CategoryModel> categories=categoryService.getRootCategories(pagination);
		List<CategoryData> categoriesData=convert(categories);
		return categoriesData;
	}

	@Override
	public List<CategoryData> getCategories() 
	{
		List<CategoryModel> categories=categoryService.getRootCategories();
		List<CategoryData> categoriesData=convert(categories);
		return categoriesData;
	}
	
	private List<CategoryData> convert(List<CategoryModel> categories) 
	{
		List<CategoryData> categoriesData= new ArrayList<CategoryData>();
		
		for(CategoryModel category: categories)
		{
			CategoryData categoryData= new CategoryData();
			categoryData.setId(category.getId());
			categoryData.setName(category.getName());
			categoryData.setDescription(category.getDescription());
			categoryData.setHasSubCategories(category.getHasSubCategories());
			categoryData.setHasSupCategories(category.getHasSuperCategories());
			categoriesData.add(categoryData);
			
			if(category.getMedia()!= null && category.getMedia().getUrl()!= null)
			{
				categoryData.setCategoryImageUrl(category.getMedia().getUrl());
			}
			else
			{
				categoryData.setCategoryImageUrl("http://res.cloudinary.com/vcommerce/image/upload/v1528049926/sd_asqm12.png");
			}
		}
		return categoriesData;
	}

	@Override
	public List<CategoryData> getSubCategories(Long categoryId) 
	{
		return null;
	}

}

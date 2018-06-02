package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.CategoryDao;
import com.training.core.model.CategoryModel;
import com.training.core.query.data.CategoryQueryData;
import com.training.core.service.CategoryService;

@Service("categoryService")
public class DefaultCategoryService implements CategoryService
{
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;
	

	@Override
	@Transactional
	public void saveProduct(CategoryModel categoryModel) 
	{
		categoryDao.createCategory(categoryModel);
		
	}

	@Override
	public List<CategoryModel> getRootCategories() 
	{
		return categoryDao.getRootCategories();
	}

	@Override
	public List<CategoryModel> getRootCategories(CategoryQueryData categoryQuery) 
	{
		return categoryDao.getRootCategories(categoryQuery);
	}

	@Override
	public CategoryModel getCategoryById(Long categoryId) 
	{
		return categoryDao.getCategoryById(categoryId);
	}

}

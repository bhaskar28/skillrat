package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.training.core.dao.ProductDao;
import com.training.core.model.CustomerModel;
import com.training.core.model.ProductModel;
import com.training.core.service.ProductService;

//This service annotation is to identify a service
@Service("productService")
public class DefualtProductService implements ProductService
{
	//This annotation will inject dependency 
	@Resource(name="productDao")
	private ProductDao productDao;
	
	//Whenever we are going to save something in database we should use 
	//@transactional on method in service level
	@Override
	@Transactional
	@CacheEvict(value="productCache", key="#id")
	public void saveProduct(ProductModel productModel) 
	{
		productDao.createProduct(productModel);
	}
	
	@Override
	@Transactional
	/*@Cacheable(value="productCache", key="#id")*/
	public ProductModel getProductById(Long id) 
	{
		return productDao.getProductById(id);
	}
}

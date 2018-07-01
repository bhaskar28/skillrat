package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.ProductDao;
import com.training.core.model.ProductModel;
import com.training.core.query.data.ProductQueryData;
import com.training.core.service.ProductService;

@Service("productService")
public class DefualtProductService implements ProductService
{
	@Resource(name="productDao")
	private ProductDao productDao;
	
	@Override
	@Transactional
	public void saveProduct(ProductModel productModel) 
	{
		productDao.createProduct(productModel);
	}

	@Override
	@Transactional
	public List<ProductModel> getProductsByCustomer(Long customerId) 
	{
		return productDao.getProductsByCustomer(customerId);
	}

	@Override
	@Transactional
	public List<ProductModel> getProductsByCustomer(ProductQueryData productQuery)
	{
		return productDao.getProductsByCustomer(productQuery);
	}

	@Override
	@Transactional
	public ProductModel getProductById(Long productId) 
	{
		return productDao.getProductById(productId);
	}

	@Override
	public List<ProductModel> getProducts(ProductQueryData productQuery) 
	{
		return productDao.getProducts(productQuery);
	}
}

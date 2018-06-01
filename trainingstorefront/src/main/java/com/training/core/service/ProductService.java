package com.training.core.service;

import java.util.List;

import com.training.core.model.ProductModel;

public interface ProductService 
{
	void saveProduct(ProductModel productModel);
	List<ProductModel> getProductsByCustomer(Long customerId);
}

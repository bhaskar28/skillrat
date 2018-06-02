package com.training.core.service;

import java.util.List;

import com.training.core.model.ProductModel;
import com.training.core.query.data.ProductQueryData;

public interface ProductService 
{
	void saveProduct(ProductModel productModel);
	List<ProductModel> getProductsByCustomer(Long customerId);
	List<ProductModel> getProductsByCustomer(ProductQueryData productQuery);
	ProductModel getProductById(Long productId);
}

package com.training.core.dao;

import java.util.List;

import com.training.core.model.ProductModel;
import com.training.core.query.data.ProductQueryData;

public interface ProductDao 
{
	void createProduct(ProductModel productModel);
	List<ProductModel> getProductsByCustomer(Long customerId);
	List<ProductModel> getProductsByCustomer(ProductQueryData productQuery);
	ProductModel getProductById(Long productId);
	List<ProductModel> getProducts(ProductQueryData productQuery);
}

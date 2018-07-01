package com.training.facade;

import java.util.List;

import com.training.core.data.ProductData;
import com.training.core.query.data.ProductQueryData;

public interface ProductFacade 
{
	void saveProduct(ProductData productData);
	ProductData getProductById(Long productId);
	List<ProductData> getProductsByCustomer(ProductQueryData productQuery);
	List<ProductData> getProductsByCustomer(Long customerId);
	List<ProductData> getProducts(ProductQueryData productQuery);
}

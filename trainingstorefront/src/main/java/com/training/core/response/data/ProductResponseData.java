package com.training.core.response.data;

import java.util.List;

import com.training.core.data.ProductData;

public class ProductResponseData extends ResponseData
{
	private ProductData product;
	private List<ProductData> products;
	public ProductData getProduct() {
		return product;
	}
	public void setProduct(ProductData product) {
		this.product = product;
	}
	public List<ProductData> getProducts() {
		return products;
	}
	public void setProducts(List<ProductData> products) {
		this.products = products;
	}
}

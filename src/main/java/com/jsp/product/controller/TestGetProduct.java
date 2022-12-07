package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.service.ProductService;

public class TestGetProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=new Product();
		product.setId(2);
		productService.getProduct(product);
	}
}

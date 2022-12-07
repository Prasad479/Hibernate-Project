package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.service.ProductService;

public class TestGetAllProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=new Product();
		productService.getAllProduct(product);
	}
}

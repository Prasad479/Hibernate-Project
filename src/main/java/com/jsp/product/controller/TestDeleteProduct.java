package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.service.ProductService;

public class TestDeleteProduct {
	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		Product product=new Product();
		product.setId(3);
		productservice.deleteProduct(product);
	}
}

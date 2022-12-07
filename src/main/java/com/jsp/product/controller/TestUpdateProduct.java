package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.service.ProductService;

public class TestUpdateProduct {
	public static void main(String[] args) {
	
		Product product=new Product();
		if(product!=null) {
			product.setId(4);
			product.setBrand("Sony");
			product.setName("Bravia");
			product.setType("Electronics");
			product.setPrice(50000);
		
		ProductService productService=new ProductService();
			
		productService.updateProduct(product);
		}
	}
}

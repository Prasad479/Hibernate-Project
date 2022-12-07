package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.service.ProductService;

public class TestSaveProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		
		Product product = new Product();
//		product.setId(1);
		product.setName("Jeans");
		product.setBrand("Levis");
		product.setType("Clothing");
		product.setPrice(2000);
		
		Product product2=productService.saveProduct(product);
		if(product2!=null) {
			System.out.println("Product Inserted");
		}
		else {
			System.out.println("Not Inserted");
		}
	}
}

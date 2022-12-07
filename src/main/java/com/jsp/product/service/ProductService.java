package com.jsp.product.service;

import com.jsp.product.dao.ProductDao;
import com.jsp.product.dto.Product;

public class ProductService {
	ProductDao productdao=new ProductDao();
	
	public Product saveProduct(Product product) {
		return productdao.saveProduct(product);
	}
	
	public Product deleteProduct(Product product) {
		return productdao.deleteProduct(product);
	}
	
	public Product updateProduct(Product product) {
		return productdao.updateProduct(product);
	}
	
	public Product getProduct(Product product) {
		return productdao.getProduct(product);
	}
	
	public Product getAllProduct(Product product) {
		return productdao.getAllProduct(product);
	}
}

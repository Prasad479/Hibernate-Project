package com.jsp.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.product.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prasad");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
	}
	
	public Product deleteProduct(Product product) {
		Product p=entityManager.find(Product.class, product.getId());
		if(p!=null) {
			entityTransaction.begin();
			entityManager.remove(p);
			entityTransaction.commit();
		}else {
			System.out.println("Object Not Found");
		}
		return product;
	}
	
	public Product updateProduct(Product product) {
		Product product1=entityManager.find(Product.class, product.getId());
		
		product1.setId(product.getId());
		product1.setName(product.getName());
		product1.setBrand(product.getBrand());
		product1.setType(product.getType());
		product1.setPrice(product.getPrice());
		
		if(product1!=null) {
		entityTransaction.begin();
		entityManager.merge(product1);
		entityTransaction.commit();
		System.out.println("Updated successfully");
		}else {
			System.out.println("Object Not Found");
		}
		return product1;
	}
	
	public Product getProduct(Product product) {
		Product p=entityManager.find(Product.class, product.getId());
		if(p!=null) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getBrand());
			System.out.println(p.getType());
			System.out.println(p.getPrice());
		}else {
			System.out.println("Object Not Found");
		}
		return product;
	}
	
	public Product getAllProduct(Product product) {
		String sql="Select p FROM Product p";
		Query query=entityManager.createQuery(sql);
		
		List<Product> products=query.getResultList();
		
		for(Product p : products) {
			System.out.println("================");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getBrand());
			System.out.println(p.getType());
			System.out.println(p.getPrice());
		}
		return product;
	}
}

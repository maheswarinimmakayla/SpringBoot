package com.mouritech.springbootandhibernateexample.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.springbootandhibernateexample.entity.Product;
import com.mouritech.springbootandhibernateexample.exception.ProductNameAlreadyExistsException;
import com.mouritech.springbootandhibernateexample.exception.ProductNotFoundException;
import com.mouritech.springbootandhibernateexample.exception.SellerNotFoundException;

public interface ProductService {
	Product insertProduct(Product newProduct);

	Product showProductById(String productId) throws ProductNotFoundException;

	List<Product> showAllProducts();



	Product updateProductById(String productId, Product product) throws ProductNotFoundException;

	void deleteProductById(String productId) throws ProductNotFoundException;

	ResponseEntity<List<Product>> getAllProductsBySellerId(Long sellerId) throws SellerNotFoundException;



	ResponseEntity<Product> createProduct(Long sellerId, Product newProduct) throws SellerNotFoundException;



	Product getProductNameBySeller(Long sellerId, String productname) throws ProductNameAlreadyExistsException;

}

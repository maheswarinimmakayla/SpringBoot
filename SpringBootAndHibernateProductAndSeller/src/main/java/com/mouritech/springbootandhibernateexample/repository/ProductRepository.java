package com.mouritech.springbootandhibernateexample.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.springbootandhibernateexample.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Optional<Product> findByProductId(String productId);
	List<Product> findByProductName(String productId);
	//Product updateByProductName(String productName);
	Optional<Product> findByProductNameAndSeller(Long sellerId,String productname);
	List<Product> findBySeller(Long sellerId);
	

}

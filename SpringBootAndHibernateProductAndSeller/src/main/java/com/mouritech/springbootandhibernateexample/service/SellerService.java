package com.mouritech.springbootandhibernateexample.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.springbootandhibernateexample.entity.Seller;

public interface SellerService {
	ResponseEntity<List<Seller>> getAllSellers();

	Seller insertSeller(Seller newSeller);

}

package com.mouritech.springbootwithhibernate.service;

import java.util.List;

import com.mouritech.springbootwithhibernate.entity.Store;
import com.mouritech.springbootwithhibernate.exception.StoreNotFoundException;

public interface StoreService {
	Store insertStore(Store newStore);

	Store showStoreById(String storeId) throws StoreNotFoundException;

	List<Store> showAllStore();

//	Store showStoreByCountry(String storeCountry ) throws StoreNotFoundException;

	Store updateStoreAddress(String storeId, Store store) throws StoreNotFoundException;

	void deleteStoreById(String storeId) throws StoreNotFoundException;

	
}

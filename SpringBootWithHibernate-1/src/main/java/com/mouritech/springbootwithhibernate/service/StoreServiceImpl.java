package com.mouritech.springbootwithhibernate.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springbootwithhibernate.entity.Store;
import com.mouritech.springbootwithhibernate.exception.StoreNotFoundException;
import com.mouritech.springbootwithhibernate.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreRepository  storerepository;

	@Override
	public Store insertStore(Store newStore) {
		newStore.setStoreId(generateStoreId());
		return storerepository.save(newStore);
	}
	public String generateStoreId() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 255;
	        //generate random values from 0-254
	      Long pId = (long) rand.nextInt(upperbound);
		return "P00" + pId; 
	
	}
	@Override
	public Store showStoreById(String storeId) throws StoreNotFoundException {
		return storerepository.findByStoreId(storeId).orElseThrow(() -> new StoreNotFoundException("store not found with id " + storeId));
	}
//	@Override
//	public Store showStoreByCountry(String storeCountry) throws StoreNotFoundException {
//		return storerepository.findByStoreId(storeCountry).orElseThrow(() -> new StoreNotFoundException("store not found with id " + storeCountry));
//	}
	

	@Override
	public List<Store> showAllStore() {
		return storerepository.findAll();
	}

	@Override
	public Store updateStoreAddress(String storeId, Store store) throws StoreNotFoundException {
		Store existingStore = storerepository.findByStoreId(storeId).orElseThrow(() -> new StoreNotFoundException("store not found with id " + storeId));
		existingStore.setStoreAddress(store.getStoreAddress());
		
		storerepository.save(existingStore);
		return existingStore;
	}
	

	@Override
	public void deleteStoreById(String storeId) throws StoreNotFoundException {
		Store existingStore = storerepository.findByStoreId(storeId).orElseThrow(() -> new StoreNotFoundException("store not found with id " + storeId));
		storerepository.delete(existingStore);		
	}
}

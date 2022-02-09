package com.mouritech.springbootwithhibernate.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.springbootwithhibernate.entity.Store;
import com.mouritech.springbootwithhibernate.exception.StoreNotFoundException;
import com.mouritech.springbootwithhibernate.service.StoreService;


@RestController// (@Controller + @ResponseBody)
@RequestMapping("store/api/v1")
public class StoreController {
	@Autowired
	StoreService storeservice;
	@PostMapping("store")
	public Store insertStore(@RequestBody Store newStore) {
		
		return storeservice.insertStore(newStore);
		
	}
	
	@GetMapping("store")
	public List<Store> showAllStore(){
		return storeservice.showAllStore();
		
	}
	
	@GetMapping("store/{sid}")
	public Store showStoreById(@PathVariable("sid") String storeId) throws StoreNotFoundException{
		return storeservice.showStoreById(storeId);
		
	}
//	@GetMapping("store/{scountry}")
//	public Store showStoreByCountry(@PathVariable("scountry") String storeCountry) throws StoreNotFoundException{
//		return storeservice.showStoreByCountry(storeCountry);
//		
//	}
	@PutMapping("store/{sid}")
	public Store updateStoreAddress(@PathVariable("sid") String storeId,@RequestBody Store store) throws StoreNotFoundException{
		return storeservice.updateStoreAddress(storeId,store);
		
	}
	
	@DeleteMapping("store/{sid}")
	public String deleteStoreById(@PathVariable("sid") String storeId) throws StoreNotFoundException{
		storeservice.deleteStoreById(storeId);
		 return "deleted the store";
		
	}
	
}

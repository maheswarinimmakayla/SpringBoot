package com.mouritech.springbootwithhibernate.repository;
import java.util.List;
import java.util.Optional;
import com.mouritech.springbootwithhibernate.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface StoreRepository  extends JpaRepository<Store, Long>{

	Optional<Store> findByStoreId(String storeId);
	List<Store> findByStoreAddress(String storeId);
	//Product updateByProductName(String productName);
	



}

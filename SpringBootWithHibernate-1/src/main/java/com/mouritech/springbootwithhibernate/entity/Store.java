package com.mouritech.springbootwithhibernate.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "Store_info")
@EntityListeners(AuditingEntityListener.class)
public class Store {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id",length = 64)
	private String storeId;

	@Column(name="store_address")
	private String storeAddress;
	
	@Column(name="store_city")
	private String storeCity;
	
	@Column(name="store_country")
	private String storeCountry;
	
	@Column(name="store_email")
	private String storeEmail;
	
	@Column(name="store_startedate")
	@LastModifiedDate
	private Date store_StarteDate;
	
	@Column(name="store_contactno")
	private Long storeContactno;
	public Store() {
		
	}
	public Store(String storeId, String storeAddress) {
		super();
		this.storeId = storeId;
		this.storeAddress = storeAddress;
	}
	public Store(String storeId, String storeAddress, String storeCity, String storeCountry, String storeEmail,
			Date store_StarteDate, Long storeContactno) {
		super();
		this.storeId = storeId;
		this.storeAddress = storeAddress;
		this.storeCity = storeCity;
		this.storeCountry = storeCountry;
		this.storeEmail = storeEmail;
		this.store_StarteDate = store_StarteDate;
		this.storeContactno = storeContactno;
	}

	public Store(String storeAddress, String storeCity, String storeCountry, String storeEmail, Date store_StarteDate,
			Long storeContactno) {
		super();
		this.storeAddress = storeAddress;
		this.storeCity = storeCity;
		this.storeCountry = storeCountry;
		this.storeEmail = storeEmail;
		this.store_StarteDate = store_StarteDate;
		this.storeContactno = storeContactno;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreCity() {
		return storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreCountry() {
		return storeCountry;
	}

	public void setStoreCountry(String storeCountry) {
		this.storeCountry = storeCountry;
	}

	public String getStoreEmail() {
		return storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public Date getStore_StarteDate() {
		return store_StarteDate;
	}

	public void setStore_StarteDate(Date store_StarteDate) {
		this.store_StarteDate = store_StarteDate;
	}

	public Long getStoreContactno() {
		return storeContactno;
	}

	public void setStoreContactno(Long storeContactno) {
		this.storeContactno = storeContactno;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeAddress=" + storeAddress + ", storeCity=" + storeCity
				+ ", storeCountry=" + storeCountry + ", storeEmail=" + storeEmail + ", store_StarteDate="
				+ store_StarteDate + ", storeContactno=" + storeContactno + "]";
	}

	
	
	
}

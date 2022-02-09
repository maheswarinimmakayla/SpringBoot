package com.mouritech.springbootandhibernateexample.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="seller")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sellerid",length = 64)
	private Long sellerId;
	
	@Column(name = "sellername" ,nullable = false)
	private String sellerName;
	
	@Column(name="selleremail",nullable = false)
	@Email(message = "Not a valid email")
	private String sellerEmail;
	
	@Column(name="sellerphoneno",nullable = false)
	private String sellerPhoneno;
	
	
	
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(String sellerName, @Email(message = "Not a valid email") String sellerEmail, String sellerPhoneno) {
		super();
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerPhoneno = sellerPhoneno;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerPhoneno() {
		return sellerPhoneno;
	}

	public void setSellerPhoneno(String sellerPhoneno) {
		this.sellerPhoneno = sellerPhoneno;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerPhoneno=" + sellerPhoneno + "]";
	}
	

}

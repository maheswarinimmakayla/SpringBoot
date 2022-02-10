package com.mouritech.springbootthymeleafsecurityexample.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "user",uniqueConstraints = @UniqueConstraint(columnNames = "user_email"))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id",length = 64)
    private Long userId;
	@Column(name = "user_fname",length = 64)
	private String userFName;
	@Column(name = "user_lname",length = 64)
	private String userLName;
	@Column(name = "user_email",length = 64)
	private String userEmail;
	@Column(name = "user_password",length = 64)
	private String userPasssword;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(name="user_id",referencedColumnName = "user_id"),
			inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "role_id"))
	private Collection<Role> roles;
	
	public User() {
		
	}

	public User(String userFName, String userLName, String userEmail, String userPasssword, Collection<Role> roles) {
		super();
		this.userFName = userFName;
		this.userLName = userLName;
		this.userEmail = userEmail;
		this.userPasssword = userPasssword;
		this.roles = roles;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserFName() {
		return userFName;
	}

	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}

	public String getUserLName() {
		return userLName;
	}

	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPasssword() {
		return userPasssword;
	}

	public void setUserPasssword(String userPasssword) {
		this.userPasssword = userPasssword;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
}

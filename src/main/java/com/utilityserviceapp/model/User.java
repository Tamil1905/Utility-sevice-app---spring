package com.utilityserviceapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data

@Entity(name="utility_app_users")
public class User {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement
	@Column(name="id")
	private Integer id;
	
	@Column(name="name", nullable = false, length = 50)
	private String name;
	
	@Column(name="email", unique = true,nullable = false)
	private String email;
	private Long mobile;
	
	private String password;
	
	private String role ="USER";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
//	@OneToMany(mappedBy = "user", 
//			fetch = FetchType.LAZY,
//			//fetch = FetchType.EAGER,
//            cascade = CascadeType.ALL)
//	private List<Account> accounts = new ArrayList<Account>();

	
}


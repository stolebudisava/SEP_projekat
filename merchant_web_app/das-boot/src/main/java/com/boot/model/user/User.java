package com.boot.model.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String userName;

	private String pass;

	private String name;

	private String surName;

	private String userJmbg;

	private String passportNumber;

	private String address;

	private String phone;

	// private ArrayList<Insurance> insurances;

	private String email;

	// private CreditCard creditCard;

	// private boolean isLoggendIn;

	public User() {
	}

	public User(Long id, String userName, String pass, String name, String surName, String userJmbg,
			String passportNumber, String address, String phone, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.pass = pass;
		this.name = name;
		this.surName = surName;
		this.userJmbg = userJmbg;
		this.passportNumber = passportNumber;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	
}

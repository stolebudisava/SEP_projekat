package com.boot.model.user;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.boot.model.CreditCard;
import com.boot.model.insurance.Insurance;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 20)
	private String userName;

	@Column(nullable = false, length = 100)
	private String pass;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(nullable = false, length = 100)
	private String surname;

	@Column(nullable = false, length = 13)
	private String userJmbg;

	private String passportNumber;

	private String address;

	private String phone;

	private ArrayList<Insurance> insurances;

	private String email;

	private CreditCard creditCard;

	private boolean isLoggendIn;

	public User() {
	}

	public User(Long id, String userName, String pass, String name, String surname, String userJmbg,
			String passportNumber, String address, String phone, ArrayList<Insurance> insurances, String email,
			CreditCard creditCard, boolean isLoggendIn) {
		super();
		this.id = id;
		this.userName = userName;
		this.pass = pass;
		this.name = name;
		this.surname = surname;
		this.userJmbg = userJmbg;
		this.passportNumber = passportNumber;
		this.address = address;
		this.phone = phone;
		this.insurances = insurances;
		this.email = email;
		this.creditCard = creditCard;
		this.isLoggendIn = isLoggendIn;
	}

}
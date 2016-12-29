package com.boot.model.insurance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/*
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
@Table(name = "home_insurances")
*/
public class HomeInsurance {
/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 20)
	private double floorArea;

	@Column(nullable = false, length = 20)
	private String homeAddress;

	@Column(nullable = false, length = 20)
	private String homeOwner;

	@Column(nullable = false, length = 20)
	private Long ownerJmbg;

	@Column(nullable = false, length = 20)
	private Long ownerName;

	@Column(nullable = false, length = 20)
	private Long ownerSurname;

	@Column(nullable = false, length = 20)
	private InsuranceType type;

	public HomeInsurance() {
	}

	public HomeInsurance(Long id, double floorArea, String homeAddress, String homeOwner, Long ownerJmbg,
			Long ownerName, Long ownerSurname, InsuranceType type) {
		super();
		this.id = id;
		this.floorArea = floorArea;
		this.homeAddress = homeAddress;
		this.homeOwner = homeOwner;
		this.ownerJmbg = ownerJmbg;
		this.ownerName = ownerName;
		this.ownerSurname = ownerSurname;
		this.type = type;
	}
*/
}

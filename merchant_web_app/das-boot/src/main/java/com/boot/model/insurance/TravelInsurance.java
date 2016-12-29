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
@Table(name = "travel_insurances")
*/
public class TravelInsurance {
/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 20)
	private String carBrand;

	@Column(nullable = false, length = 20)
	private String carType;

	@Column(nullable = false, length = 20)
	private int carYear;

	@Column(nullable = false, length = 20)
	private String carLicencePlate;

	@Column(nullable = false, length = 20)
	private String carChasisNum;

	@Column(nullable = false, length = 20)
	private String carOwner;

	@Column(nullable = false, length = 20)
	private Long ownerJmbg;

	@Column(nullable = false, length = 20)
	private InsuranceType type;

	public TravelInsurance() {
	}

	public TravelInsurance(Long id, String carBrand, String carType, int carYear, String carLicencePlate,
			String carChasisNum, String carOwner, Long ownerJmbg, InsuranceType type) {
		super();
		this.id = id;
		this.carBrand = carBrand;
		this.carType = carType;
		this.carYear = carYear;
		this.carLicencePlate = carLicencePlate;
		this.carChasisNum = carChasisNum;
		this.carOwner = carOwner;
		this.ownerJmbg = ownerJmbg;
		this.type = type;
	}
	*/

}

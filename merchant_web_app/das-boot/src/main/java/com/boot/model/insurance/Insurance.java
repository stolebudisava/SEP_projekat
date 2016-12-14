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

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
@Table(name = "insurances")

public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 20)
	private Date starts;

	@Column(nullable = false, length = 20)
	private Date ends;

	@Column(nullable = false, length = 20)
	private String region;

	@Column(nullable = false, length = 4)
	private int peopleNum;

	@Column(nullable = false, length = 3)
	private int peopleAge;

	@Column(nullable = false, length = 20)
	private String sport;

	@Column(nullable = false, length = 10)
	private int insuranceAmount; // 10 000,30 000

	@Column(nullable = false, length = 10)
	private InsuranceType insuranceType;

	@Column(nullable = false, length = 10)
	private HomeInsurance homeInsurance;

	@Column(nullable = false, length = 10)
	private TravelInsurance travelInsurance;

	@Column(nullable = false, length = 10)
	private double totalPrice;

	public Insurance() {

	}

	public Insurance(Long id, Date starts, Date ends, String region, int peopleNum, int peopleAge, String sport,
			int insuranceAmount, InsuranceType insuranceType, HomeInsurance homeInsurance,
			TravelInsurance travelInsurance, double totalPrice) {
		super();
		this.id = id;
		this.starts = starts;
		this.ends = ends;
		this.region = region;
		this.peopleNum = peopleNum;
		this.peopleAge = peopleAge;
		this.sport = sport;
		this.insuranceAmount = insuranceAmount;
		this.insuranceType = insuranceType;
		this.homeInsurance = homeInsurance;
		this.travelInsurance = travelInsurance;
		this.totalPrice = totalPrice;
	}

}

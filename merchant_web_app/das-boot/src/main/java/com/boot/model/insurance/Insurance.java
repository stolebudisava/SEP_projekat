package com.boot.model.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "insurances")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;

	public Insurance() { }

	public Insurance(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

}

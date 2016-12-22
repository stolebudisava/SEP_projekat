package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "shipwreck")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	String description;

	public Insurance() { }

	public Insurance(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

}

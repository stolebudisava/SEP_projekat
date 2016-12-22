package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Insurance;
import com.boot.repository.InsuranceRepository;

@RestController
@RequestMapping("api/v1/")
public class InsuranceController {
	
	@Autowired
	private InsuranceRepository insuranceRepository;

	@RequestMapping(value = "insurances", method = RequestMethod.GET)
	public List<Insurance> list() {
		return insuranceRepository.findAll();
	}

	@RequestMapping(value = "insurances", method = RequestMethod.POST)
	public Insurance create(@RequestBody Insurance insurance) {
		return insuranceRepository.saveAndFlush(insurance);
	}

	@RequestMapping(value = "insurances/{id}", method = RequestMethod.GET)
	public Insurance get(@PathVariable Long id) {
		return insuranceRepository.findOne(id);
	}

	@RequestMapping(value = "insurances/{id}", method = RequestMethod.PUT)
	public Insurance update(@PathVariable Long id, @RequestBody Insurance insurance) {
		Insurance existingInsurance = insuranceRepository.findOne(id);
		BeanUtils.copyProperties(insurance, existingInsurance);
		return insuranceRepository.saveAndFlush(existingInsurance);
	}

	@RequestMapping(value = "insurances/{id}", method = RequestMethod.DELETE)
	public Insurance delete(@PathVariable Long id) {
		Insurance existingInsurance = insuranceRepository.findOne(id);
		insuranceRepository.delete(existingInsurance);
		return existingInsurance;
	}
	
}

package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.insurance.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Long>{

}

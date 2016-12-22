package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.user.User;

public interface RegisterRepository extends JpaRepository<User, Long> {

}

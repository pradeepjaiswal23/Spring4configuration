package com.aartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aartek.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer>{
	
	
	
}

package com.aartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aartek.model.User;

public interface LoginRepository extends JpaRepository< User, Integer>{
	
	public User findByEmailAndPassword(String email,String password);

}

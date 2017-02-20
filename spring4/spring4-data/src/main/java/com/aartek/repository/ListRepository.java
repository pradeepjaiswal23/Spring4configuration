package com.aartek.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aartek.model.User;

public interface ListRepository extends JpaRepository<User, Integer>{

	List<User> findById(Integer arg);

	
	
}

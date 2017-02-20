package com.aartek.service;

import java.util.List;

import com.aartek.model.User;

public interface ListService {

	public List<User> showResigtrationList();

	public List<User> findById(Integer arg);

	public void deleteUser(Integer arg);

	
	
}

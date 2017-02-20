package com.aartek.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.ListRepository;
import com.aartek.service.ListService;


@Service
public class ListServiceImpl implements ListService {

	
	@Autowired
	private ListRepository listRepository;
	
	public List<User> showResigtrationList() {

		List<User> list=listRepository.findAll();
		
		return list;
	}

	public List<User> findById(Integer arg) {
		
		List<User> list=listRepository.findById(arg);
		
		return list;
	}

	public void deleteUser(Integer arg) {

		listRepository.delete(arg);
		
	}
	
	

}

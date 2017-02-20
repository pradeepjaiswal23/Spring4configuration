package com.aartek.service;

import com.aartek.model.User;

public interface LoginService {

	public boolean findByEmailAndPassword(String email, String password);



}

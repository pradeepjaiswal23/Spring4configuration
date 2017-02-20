package com.aartek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.LoginRepository;
import com.aartek.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public boolean findByEmailAndPassword(String email, String password) {

		User oldUser = loginRepository.findByEmailAndPassword(email, password);

		if (oldUser != null) {

			return true;
		} else {
			return false;
		}

	}

}

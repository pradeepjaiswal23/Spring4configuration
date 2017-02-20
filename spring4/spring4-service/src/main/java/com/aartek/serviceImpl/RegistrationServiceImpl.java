package com.aartek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.RegistrationRepository;
import com.aartek.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;

	public boolean saveUser(User user) {

		User oldUser = registrationRepository.save(user);
	

		if (oldUser != null) {

			return true;

		} else {

			return false;
		}

	}

}

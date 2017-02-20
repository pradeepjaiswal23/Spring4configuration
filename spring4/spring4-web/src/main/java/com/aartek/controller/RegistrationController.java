package com.aartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationSevice;

	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String showLogin(@ModelAttribute("registration") User user, Model model, String userMessage) {
		model.addAttribute("userMessage", userMessage);
		return "registration";
	}

	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveRegistration(@ModelAttribute("registration") User userRegistration, Model model,
			String userMessage) {

		boolean status = registrationSevice.saveUser(userRegistration);

		if (status) {
			model.addAttribute("userMessage", "Your registration has been completed successfully");

			return "redirect:welcome";

		} else {

			return "redirect:registration";
		}

	}
	

}

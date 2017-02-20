package com.aartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String showLogin(@ModelAttribute("login") User user, Model model, String userMessage) {
		model.addAttribute("message", userMessage);
		return "login";
	}
	
	@RequestMapping(value = "userLogin", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("login") User userLogin,Model model,String userMessage){
		
		boolean status=loginService.findByEmailAndPassword(userLogin.getEmail(), userLogin.getPassword());
		
		if(status){
			
			model.addAttribute("userMessage", "Your Login has been completed successfully");
			
			return "redirect:welcome";
		}
		else
		{
			model.addAttribute("userMessage", "You have entered an invalid username or password");
			
			return "redirect:registration";
			
		}
		
		
	
	}
	
	
}

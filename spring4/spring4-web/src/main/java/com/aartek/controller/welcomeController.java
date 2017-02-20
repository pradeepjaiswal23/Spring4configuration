package com.aartek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcomeController {

	
	@RequestMapping(value="welcome")
	public String showWelcome(String userMessage,Model model){
		
		model.addAttribute("userMessage", userMessage);
		
		return "welcome";
		
	}
	
}

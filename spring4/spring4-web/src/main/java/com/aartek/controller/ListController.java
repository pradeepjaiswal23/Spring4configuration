package com.aartek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aartek.model.User;
import com.aartek.service.ListService;

@Controller
public class ListController {

	List<User> List_obj=null;
	
	@Autowired
	private ListService listService;

	
	
	
	@RequestMapping(value = "registratioinList", method = RequestMethod.GET)
	public String showList(@ModelAttribute("records") User user, Model model) {
		List_obj = listService.showResigtrationList();
		model.addAttribute("records", List_obj);
		return "deshboard";

	}
	
	@RequestMapping(value="edit", method=RequestMethod.GET )
	public String editList(@ModelAttribute("registration") User user,@RequestParam(required=false)Integer arg,Model model){
		
		List<User> list=listService.findById(arg);
		
		model.addAttribute("id", arg);
		model.addAttribute("fname",list.get(0).getFname());
		model.addAttribute("lname",list.get(0).getLname());
		model.addAttribute("contact",list.get(0).getContact());
		model.addAttribute("email", list.get(0).getEmail());
		
		model.addAttribute("records",List_obj);
		
		return "editRegistration";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET )
	public String deleteUser(@RequestParam(required=false)Integer arg,Model model){
		
		listService.deleteUser(arg);
		
		return "redirect:registratioinList";
	}
	

	
}

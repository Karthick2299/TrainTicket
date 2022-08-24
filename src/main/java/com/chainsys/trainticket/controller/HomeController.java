package com.chainsys.trainticket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(name ="/home")
public class HomeController {
	
	@GetMapping("/useraccess")
	public String getUsers(Model model) {
		String message ="User Access";
		model.addAttribute("message",message);
		return "user-access";
	}
	@GetMapping("/submitbutton")
	public String getButton(Model model) {
		String message ="Submit Button";
		model.addAttribute("message",message);
		return "submit";
	}
	@GetMapping("/return")
	public String getSubmit(Model model) {
		
		return "redirect:/";
	}

	
	

}

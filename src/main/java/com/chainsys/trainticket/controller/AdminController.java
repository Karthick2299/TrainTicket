package com.chainsys.trainticket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/adminaccess")
	public String getUsers(Model model) {
		
		return "admin-access";
	}

	

}

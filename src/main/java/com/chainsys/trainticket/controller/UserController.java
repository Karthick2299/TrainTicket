package com.chainsys.trainticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.trainticket.pojo.User;
import com.chainsys.trainticket.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService urservice;
	 
	@GetMapping("/list")
	public String getUsers(Model model) {
		List<User> theUr= urservice.getUsers();
		model.addAttribute("allusers", theUr);
		return "list-user";
	}
}

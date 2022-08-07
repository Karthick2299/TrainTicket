package com.chainsys.trainticket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.trainticket.dto.UserAndPaymentDetailDTO;
import com.chainsys.trainticket.dto.UserAndTicketDTO;
import com.chainsys.trainticket.model.User;
import com.chainsys.trainticket.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService urservice;
	 
	@GetMapping("/listuser")
	public String getUsers(Model model) {
		List<User> theUr= urservice.getUsers();
		model.addAttribute("allusers", theUr);
		return "list-user";
	}
	@GetMapping("/addform")
	public String AddForm(Model model) {
		User theUr = new User();
		model.addAttribute("adduser", theUr);
		return "add-user-form";
	}

	@PostMapping("/newuser")
	public String adduser(@ModelAttribute("adduser") User theUr) {
		urservice.save(theUr);
		return "redirect:/user/listuser";
}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("user_id") String id, Model model) {
		Optional<User> theUr = urservice.findByid(id);
		model.addAttribute("updateuser", theUr);
		return "update-user-form";
	}

	@PostMapping("/updateur")
	public String modifyuser(@ModelAttribute("updateuser") User theUr) {
	 urservice.save(theUr);
		return "redirect:/user/listuser";
	}
	@GetMapping("/deleteuser")
	public String deleteuser(@RequestParam("user_id") String id) {
		urservice.deleteById(id);
		return "redirect:/user/listuser";
	}

	@GetMapping("/getuserbyid")
	public String getuser(@RequestParam("user_id") String id, Model model) {
		Optional<User> ur = urservice.findByid(id);
		model.addAttribute("getuserbyid", ur);
		return "find-user-by-id";
	}
	@GetMapping("/getuserticket")
	public String getUserAndTicket(@RequestParam("ticket")String name,Model model) {
		UserAndTicketDTO dto = urservice.getUserAndTicketDTO(name);
		model.addAttribute("user",dto.getUser());
		model.addAttribute("ticket",dto.getTicket());
		return "user-and-ticket";
	}
	@GetMapping("/getuserpayment")
	public String getUserAndPaymentDetail(@RequestParam("user")String string,Model model) {
		UserAndPaymentDetailDTO dto1 = urservice.getUserAndPaymentDetailDTO(string);
		model.addAttribute("user",dto1.getUser());
		model.addAttribute("payment",dto1.getPaymentDetail());
		return "user-and-payment-detail";
}
} 
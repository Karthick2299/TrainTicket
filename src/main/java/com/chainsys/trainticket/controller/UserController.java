package com.chainsys.trainticket.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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
	UserService userservice;

	@GetMapping("/listuser")
	public String getUsers(Model model) {
		List<User> user = userservice.getUsers();
		model.addAttribute("allusers", user);
		return "list-user";
	}

	@GetMapping("/addform")
	public String addUserForm(Model model) {
		User user = new User();
		model.addAttribute("adduser", user);
		return "add-user-form";
	}

	@PostMapping("/newuser")
	public String addUser(@Valid @ModelAttribute("adduser") User user, Errors errors) {
		if (errors.hasErrors()) {
			return "add-user-form";
		}
		userservice.save(user);
		return "redirect:/user/userloginform";
	}

	@GetMapping("/modifyuser")
	public String updateUser() {

		return "modifyuserform";
	}

	@GetMapping("/updateform")
	public String showUpdateForm(int id, Model model) {
		User user = userservice.findByid(id);
		model.addAttribute("updateuser", user);
		return "update-user-form";
	}

	@PostMapping("/updateur")
	public String modifyUser(@Valid @ModelAttribute("updateuser") User user, Errors errors) {
		if (errors.hasErrors()) {
			return "update-user-form";
		}
		userservice.save(user);
		return "redirect:/user/listuser";
	}

	@GetMapping("/deleteform")
	public String deleteUser() {

		return "deleteuserform";
	}

	@GetMapping("/deleteuser")
	public String deleteUserDetail(int id) {
		userservice.deleteById(id);
		return "redirect:/user/listuser";
	}

	@GetMapping("/finduser")
	public String findUser() {

		return "finduserform";
	}

	@GetMapping("/getuserbyid")
	public String getUser(int id, Model model) {
		User user = userservice.findByid(id);
		model.addAttribute("getuserbyid", user);
		return "find-user-by-id";
	}

	@GetMapping("/getuserticket")
	public String getUserAndTicket(@RequestParam("ticket") int name, Model model) {
		UserAndTicketDTO dto = userservice.getUserAndTicketDTO(name);
		model.addAttribute("user", dto.getUser());
		model.addAttribute("ticket", dto.getTicket());
		return "user-and-ticket";
	}

	@GetMapping("/getuserpayment")
	public String getUserAndPaymentDetail(@RequestParam("user") int string, Model model) {
		UserAndPaymentDetailDTO dto1 = userservice.getUserAndPaymentDetailDTO(string);
		model.addAttribute("user", dto1.getUser());
		model.addAttribute("payment", dto1.getPaymentDetail());
		return "user-and-payment-detail";
	}

	@GetMapping("/userloginform")
	public String userLoginForm(Model model) {
		User user = new User();
		model.addAttribute("userlogin", user);
		return "user-login-form";
	}

	@PostMapping("/checkuserloginform")
	public String checkingAccess(@ModelAttribute("userlogin") User user,HttpSession session,Model model) {
		User userlogin = userservice.getUserByNameAndPassword(user.getUserName(), user.getUserPassword());
		if (userlogin != null) {
			session.setAttribute("userId", userlogin.getUserId());
			model.addAttribute("loggeduser", userlogin);
			return "user-access";
		} else
			
			return "user-relogin";

	}
	@GetMapping("/useraccessa")
	public String getUserAccess(Model model) {
		
		return "user-access";
	}
	@GetMapping("/submitbut")
	public String getSubmit(Model model) {
		
		return "submit";
	}
	@GetMapping("/return")
	public String getReturn(Model model) {
		
		return "redirect:/";
	}

}
package com.chainsys.trainticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.service.TicketService;


@Controller
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	TicketService ticketservice;
	 
	@GetMapping("/listticket")
	public String getTickets(Model model) {
		List<Ticket> theTk= ticketservice.getTickets();
		model.addAttribute("alltickets", theTk);
		return "list-ticket-form";
	}
	@GetMapping("/addform")
	public String AddForm(Model model) {
		Ticket theTk = new Ticket();
		model.addAttribute("addticket", theTk);
		return "add-ticket-form";
	}

	@PostMapping("/newticket")
	public String addticket(@ModelAttribute("addticket") Ticket theTk) {
		ticketservice.save(theTk);
		return "redirect:/ticket/listticket";
}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("ticketNo") int id, Model model) {
		Ticket theTk = ticketservice.findByid(id);
		model.addAttribute("updateticket", theTk);
		return "update-ticket-form";
	}

	@PostMapping("/updatetk")
	public String modifyticket(@ModelAttribute("updateticket") Ticket theTk) {
	 ticketservice.save(theTk);
		return "redirect:/ticket/listticket";
	}
	@GetMapping("/deleteticket")
	public String deleteticket(@RequestParam("ticketNo") int id) {
		ticketservice.deleteById(id);
		return "redirect:/ticket/listticket";
	}

	@GetMapping("/getticketbyid")
	public String getticketbyid(@RequestParam("ticketNo") int id, Model model) {
		Ticket ur = ticketservice.findByid(id);
		model.addAttribute("getticketbyid", ur);
		return "find-ticket-by-id";
	}

}

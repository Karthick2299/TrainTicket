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

import com.chainsys.trainticket.model.TicketFare;
import com.chainsys.trainticket.service.TicketFareService;


@Controller
@RequestMapping("/ticketfare")
public class TicketFareController {
	@Autowired
	TicketFareService ticfareservice;
	 
	@GetMapping("/listtktfare")
	public String getTicketFares(Model model) {
		List<TicketFare> theTf= ticfareservice.getTicketFares();
		model.addAttribute("alltktfare", theTf);
		return "list-ticket-fare-form";
	}
	@GetMapping("/addform")
	public String AddTicketFare(Model model) {
		TicketFare theTf = new TicketFare();
		model.addAttribute("addtkfare", theTf);
		return "add-ticket-fare-form";
	}

	@PostMapping("/newticketfare")
	public String addtkfare(@ModelAttribute("addtktfare") TicketFare theTf) {
		ticfareservice.save(theTf);
		return "redirect:/ticketfare/list-ticket-fare-form";
}
	@GetMapping("/updateform")
	public String updateTicketFareForm(@RequestParam("TrainNo")int id, Model model) {
		TicketFare theTn = ticfareservice.findByid(id);
		model.addAttribute("updatetkfare", theTn);
		return "update-ticket-fare-form";
	}

	@PostMapping("/updatetf")
	public String modifyticketfare(@ModelAttribute("updatetkfare") TicketFare theTf) {
		ticfareservice.save(theTf);
		return "redirect:/ticketfare/list-ticket-fare-form";
	}
	@GetMapping("/deletetf")
	public String deleteticketfare(@RequestParam("TrainNo") int id) {
		ticfareservice.deleteById(id);
		return "redirect:/ticketfare/list-ticket-fare-form";
	}

	@GetMapping("/getticketfarebyno")
	public String getticketbyid(@RequestParam("TrainNo") int id, Model model) {
		TicketFare tn = ticfareservice.findByid(id);
		model.addAttribute("getticketfarebynum", tn);
		return "find-ticket-fare-by-ticketnum";
	}


}

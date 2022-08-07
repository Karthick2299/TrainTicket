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

import com.chainsys.trainticket.model.TicketDetail;
import com.chainsys.trainticket.service.TicketDetailService;


@Controller
@RequestMapping("/ticketdetail")
public class TicketDetailController {
	@Autowired
	TicketDetailService ticketdetailservice;
	 
	@GetMapping("/listticketdetail")
	public String getTicketDetails(Model model) {
		List<TicketDetail> theTk= ticketdetailservice.getTicketDetails();
		model.addAttribute("allticketdetails", theTk);
		return "list-ticket-detail-form";
	}
	@GetMapping("/addform")
	public String AddTicketDetail(Model model) {
		TicketDetail theTk = new TicketDetail();
		model.addAttribute("addticketdetail", theTk);
		return "add-ticket-detail-form";
	}

	@PostMapping("/newticketdetail")
	public String addticketdetail(@ModelAttribute("addticketdetail") TicketDetail theTk) {
		ticketdetailservice.save(theTk);
		return "redirect:/ticketdetail/listticketdetail";
}
	@GetMapping("/updateform")
	public String updateTicketDetailForm(@RequestParam("ticketNo") int id, Model model) {
		TicketDetail theTk = ticketdetailservice.findByid(id);
		model.addAttribute("updateticketdetail", theTk);
		return "update-ticket-detail-form";
	}

	@PostMapping("/updatetkdetail")
	public String modifyticketdetail(@ModelAttribute("updateticketdetail") TicketDetail theTk) {
	 ticketdetailservice.save(theTk);
		return "redirect:/ticketdetail/listticketdetail";
	}
	@GetMapping("/deleteticketdetail")
	public String deleteticket(@RequestParam("ticketNo") int id) {
		ticketdetailservice.deleteById(id);
		return "redirect:/ticketdetail/listticketdetail";
	}

	@GetMapping("/getticketdetailbyno")
	public String getticketbyid(@RequestParam("ticketNo") int id, Model model) {
		TicketDetail ur = ticketdetailservice.findByid(id);
		model.addAttribute("getticketdetailbynum", ur);
		return "find-ticket-detail-by-ticketnum";
	}

}

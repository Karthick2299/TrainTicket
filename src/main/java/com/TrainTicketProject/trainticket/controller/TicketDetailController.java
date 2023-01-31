package com.chainsys.trainticket.controller;

import java.util.List;
import java.util.Optional;

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

import com.chainsys.trainticket.compositekey.TicketDetailCompositeKey;
import com.chainsys.trainticket.model.TicketDetail;
import com.chainsys.trainticket.service.TicketDetailService;


@Controller
@RequestMapping("/ticketdetail")
public class TicketDetailController {
	@Autowired
	TicketDetailService ticketdetailservice;
	
	public static final String TICKETDETAIL = "redirect:/ticketdetail/listticketdetail";
	 
	@GetMapping("/listticketdetail")
	public String getTicketDetails(Model model) {
		List<TicketDetail> ticketdetail= ticketdetailservice.getTicketDetails();
		model.addAttribute("allticketdetails", ticketdetail);
		return "list-ticket-detail-form";
	}
	@GetMapping("/addform")
	public String addTicketDetail(Model model) {
		TicketDetail ticketdetail = new TicketDetail();
		model.addAttribute("addticketdetail", ticketdetail);
		return "add-ticket-detail-form";
	}

	@PostMapping("/newticketdetail")
	public String addTicketDetailSave(@Valid @ModelAttribute("addticketdetail") TicketDetail ticketdetail,Errors errors) {
		if (errors.hasErrors()) {
			return "add-ticket-detail-form";
		}
		ticketdetailservice.save(ticketdetail);
		return TICKETDETAIL;
    }
	@GetMapping("/modifyticketdetail")
	public String updateTicketDetail() {
	   
		return "modifyticketdetailform";
	}
	@GetMapping("/updateform")
	public String updateTicketDetailForm(@RequestParam("ticketNo") int id,@RequestParam("name")String value, Model model) {
		TicketDetailCompositeKey ticketDetailCompositeKey = new TicketDetailCompositeKey(id,value);
		Optional<TicketDetail> ticketdetail = ticketdetailservice.findByid(ticketDetailCompositeKey);
		model.addAttribute("updateticketdetail", ticketdetail);
		return "update-ticket-detail-form";
	}

	@PostMapping("/updatetkdetail")
	public String modifyticketdetail(@Valid @ModelAttribute("updateticketdetail") TicketDetail ticketdetail,Errors errors) {
		if (errors.hasErrors()) {
			return "update-ticket-detail-form";
		}
	 ticketdetailservice.save(ticketdetail);
		return TICKETDETAIL;
	}
	@GetMapping("/removeticketdetail")
	public String removeTicketDetail() {
	   
		return "deleteticketdetailform";
	}
	@GetMapping("/deleteticketdetail")
	public String deleteticket(@RequestParam("ticketNo") int id,@RequestParam("name")String value) {
		TicketDetailCompositeKey ticketDetailcompositeKey = new TicketDetailCompositeKey(id,value);
		ticketdetailservice.deleteById(ticketDetailcompositeKey);
		return TICKETDETAIL;
	}
	@GetMapping("/findticketdetail")
	public String findTicketDetail() {
	   
		return "findticketdetailform";
	}

	@GetMapping("/getticketdetailbyno")
	public String getticketbyid(@RequestParam("ticketNo") int id,@RequestParam("name")String value, Model model) {
		TicketDetailCompositeKey ticketdetailcompositeKey = new TicketDetailCompositeKey(id,value);
		Optional<TicketDetail> ticketdetail = ticketdetailservice.findByid(ticketdetailcompositeKey);
		model.addAttribute("getticketdetailbynum", ticketdetail);
		return "find-ticket-detail-by-ticketnum";
	}

}

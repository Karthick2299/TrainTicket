package com.chainsys.trainticket.controller;

import java.util.List;

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

import com.chainsys.trainticket.dto.TicketAndPaymentDetailDTO;
import com.chainsys.trainticket.dto.TicketAndTicketDetailDTO;
import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.TicketDetail;
import com.chainsys.trainticket.model.TicketFare;
import com.chainsys.trainticket.model.TrainDetail;
import com.chainsys.trainticket.service.TicketDetailService;
import com.chainsys.trainticket.service.TicketService;
import com.chainsys.trainticket.service.TrainDetailService;


@Controller
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	TicketService ticketservice;
	 @Autowired
	 private TrainDetailService trainDetailService;
	 @Autowired
	 private TicketDetailService ticketDetailService;

	@GetMapping("/listticket")
	public String getTickets(Model model) {
		List<Ticket> theTk= ticketservice.getTickets();
		model.addAttribute("alltickets", theTk);
		return "list-ticket-form";
	}
	@PostMapping("/addticketform")
	public String addForm(@ModelAttribute("getticketfarebynum")TicketFare ticketFare,Model model) {
		Ticket theTk = new Ticket();
		TrainDetail TrainDetail=trainDetailService.findByid(ticketFare.getTrainNo());
		theTk.setTrainNo(ticketFare.getTrainNo());
		theTk.setSeatClass(ticketFare.getSeatClass());
		theTk.setAmount(ticketFare.getFare());
		theTk.setArrivalTime(TrainDetail.getArrivalTime());
		theTk.setBoardingTime(TrainDetail.getDepartureTime());
		theTk.setBoardingStation(TrainDetail.getStartPlace());
		theTk.setDestinationStation(TrainDetail.getDestination());
		model.addAttribute("addticket", theTk);
		return "add-ticket-form";
	}

	@PostMapping("/newticket")
	public String addticket(@Valid @ModelAttribute("addticket") Ticket theTk,Errors errors) {
		if(errors.hasErrors()) {
			return "add-ticket-form";
		}
		
			ticketservice.save(theTk);
			return "redirect:/ticket/listticket";
		
		
   }
	@GetMapping("/modifyticket")
	public String updateTicket() {
	   
		return "modifyticketform";
	}
	@GetMapping("/updateticketform")
	public String showUpdateForm(@RequestParam("ticketNo") int id, Model model) {
		Ticket theTk = ticketservice.findByid(id);
		model.addAttribute("updateticket", theTk);
		return "update-ticket-form";
	}

	@PostMapping("/updatetk")
	public String modifyticket(@Valid @ModelAttribute("updateticket") Ticket theTk,Errors errors) {
		if (errors.hasErrors()) {
			return "update-ticket-form";
		}
	 ticketservice.save(theTk);
		return "redirect:/ticket/listticket";
	}
	@GetMapping("/removeticket")
	public String removeTicket() {
	   
		return "deleteticketform";
	}
	@GetMapping("/deleteticket")
	public String deleteticket(@RequestParam("ticketNo") int id) {
		ticketservice.deleteById(id);
		return "redirect:/ticket/listticket";
	}
	@GetMapping("/findticket")
	public String findTicket() {
	   
		return "findticketform";
	}
	@GetMapping("/getticketbyid")
	public String getticketbyid(@RequestParam("ticketNo") int id, Model model) {
		Ticket ur = ticketservice.findByid(id);
		model.addAttribute("getticketbyid", ur);
		return "find-ticket-by-id";
	}
	@GetMapping("/getticketandpayment")
    public String getTicketAndPayment(@RequestParam("ticketNum") int ticketNum,Model model){
		TicketAndPaymentDetailDTO dto=ticketservice.getTicketAndPaymentDetailDTO(ticketNum);
        model.addAttribute("ticket",dto.getTicket());
        model.addAttribute("paymentdetail",dto.getPaymentDetail());
        return "ticket-and-payment-detail-form";
    }
	@GetMapping("/getticketandticketdetail")
	public String getTicketAndTicketDetail(@RequestParam("ticketnum")int id,Model model) {
		TicketAndTicketDetailDTO dto1=ticketservice.getTicketAndTicketDetailDTO(id);
		model.addAttribute("ticket1",dto1.getTicket());
		model.addAttribute("ticketdetail",dto1.getTicketDetail());
		return "ticket-and-ticket-detail";
	}
	@GetMapping("/passengers")
	public String getNoOfPassengers(@RequestParam("id")int ticketNo,Model model) {
		TicketDetail ticketDetail=new TicketDetail();
		model.addAttribute("ticketDetail", ticketDetail);
		List<TicketDetail>ticketDetailList=ticketDetailService.findByTicketNo(ticketNo);
		model.addAttribute("ticketDetailList", ticketDetailList);
		return "passengers-details";
	}
	@PostMapping("/addpassengers")
	public String addPassengers(@ModelAttribute("")int id,Model model) {
		return "";
	}

}

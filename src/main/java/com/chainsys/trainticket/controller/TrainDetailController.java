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

import com.chainsys.trainticket.dto.TrainDetailAndTicketDTO;
import com.chainsys.trainticket.dto.TrainDetailAndTicketFareDTO;
import com.chainsys.trainticket.model.TrainDetail;
import com.chainsys.trainticket.service.TrainDetailService;



@Controller
@RequestMapping("/traindetail")
public class TrainDetailController {
	@Autowired
	TrainDetailService traindetailservice;
	
	public static final String LISTTRAIN = "redirect:/traindetail/listtrain";
	 
	@GetMapping("/listtrain")
	public String getTrains(Model model) {
		List<TrainDetail> theTn= traindetailservice.getTrainDetails();
		model.addAttribute("alltrains", theTn);
		return "list-train-detail-form";
	}
	@GetMapping("/addtrainform")
	public String addTrainForm(Model model) {
		TrainDetail theTn = new TrainDetail();
		model.addAttribute("addtrain", theTn);
		return "add-train-detail-form";
	}

	@PostMapping("/newtrain")
	public String addtrain(@Valid @ModelAttribute("addtrain") TrainDetail theTn,Errors errors){
		if (errors.hasErrors()){
			return "add-train-detail-form";
	}
		traindetailservice.save(theTn);
		return LISTTRAIN;
    }
	@GetMapping("/modifytraindetail")
	public String updateTrain() {
	   
		return "modifytrainform";
	}
	@GetMapping("/updatetrainform")
	public String updateTrainDetailForm(@RequestParam("TrainNo")int id, Model model) {
		TrainDetail theTn = traindetailservice.findByid(id);
		model.addAttribute("updatetrain", theTn);
		return "update-train-detail-form";
	}

	@PostMapping("/updatetn")
	public String modifytrain(@Valid @ModelAttribute("updatetrain") TrainDetail theTn,Errors errors) {
		if (errors.hasErrors()) {
			return "update-train-detail-form";
		}
		traindetailservice.save(theTn);
		return LISTTRAIN;
	}
	@GetMapping("/deletetraindetail")
	public String deleteTrain() {
	   
		return "deletetrainform";
	}
	@GetMapping("/deletetrain")
	public String deleteTrainDetail(@RequestParam("TrainNo") int id) {
		traindetailservice.deleteById(id);
		return LISTTRAIN;
	}
	@GetMapping("/findtraindetail")
	public String findTrain() {
	   
		return "findtrainform";
	}

	@GetMapping("/gettrainbyno")
	public String getticketbyid(@RequestParam("TrainNo") int id, Model model) {
		TrainDetail tn = traindetailservice.findByid(id);
		model.addAttribute("gettrainbynum", tn);
		
		return "find-train-by-num";
	}
	@GetMapping("/findtrainamount")
	public String findTrainAmount() {
	   
		return "findtrainamountform";
	}
	@GetMapping("/gettrainticketfare")
	public String getTrainDetailAndTicketFare(@RequestParam("TrainNo")int id,Model model) {
		TrainDetailAndTicketFareDTO dto=traindetailservice.getTrainDetailAndTicketFareDTO(id);
		model.addAttribute("traindetail",dto.getTraindetail());
		model.addAttribute("ticketfare",dto.getTicketfare());
		return "train-detail-ticket-fare";
	}
	@GetMapping("/findtrainticketbook")
	public String findTrainTicketBook() {
	   
		return "findtrainticketform";
	}
	@GetMapping("/gettrainticketbook")
	public String getTrainDetailAndTicket(@RequestParam("TrainNo")int id,Model model) {
		TrainDetailAndTicketDTO dto1 =traindetailservice.getTrainDetailAndTicketDTO(id);
		model.addAttribute("traindetail1",dto1.getTrainDetail());
		model.addAttribute("ticket",dto1.getTicket());
		return "train-detail-and-ticket-book";
	}


}

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
		List<TrainDetail> train= traindetailservice.getTrainDetails();
		model.addAttribute("alltrains", train);
		return "list-train-detail-form";
	}
	@GetMapping("/addtrainform")
	public String addTrainForm(Model model) {
		TrainDetail train = new TrainDetail();
		model.addAttribute("addtrain", train);
		return "add-train-detail-form";
	}

	@PostMapping("/newtrain")
	public String addtrain(@Valid @ModelAttribute("addtrain") TrainDetail train,Errors errors){
		if (errors.hasErrors()){
			return "add-train-detail-form";
	}
		traindetailservice.save(train);
		return LISTTRAIN;
    }
	@GetMapping("/modifytraindetail")
	public String updateTrain() {
	   
		return "modifytrainform";
	}
	@GetMapping("/updatetrainform")
	public String updateTrainDetailForm(@RequestParam("TrainNo")int id, Model model) {
		TrainDetail train = traindetailservice.findByid(id);
		model.addAttribute("updatetrain", train);
		return "update-train-detail-form";
	}

	@PostMapping("/updatetn")
	public String modifytrain(@Valid @ModelAttribute("updatetrain") TrainDetail train,Errors errors) {
		if (errors.hasErrors()) {
			return "update-train-detail-form";
		}
		traindetailservice.save(train);
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
		TrainDetail train = traindetailservice.findByid(id);
		model.addAttribute("gettrainbynum", train);
		
		return "find-train-by-num";
	}
	@GetMapping("/findtrainamount")
	public String findTrainAmount() {
	   
		return "findtrainamountform";
	}
	@GetMapping("/gettrainticketfare")
	public String getTrainDetailAndTicketFare(@RequestParam("TrainNo")int id,Model model) {
		TrainDetailAndTicketFareDTO traindto=traindetailservice.getTrainDetailAndTicketFareDTO(id);
		model.addAttribute("traindetail",traindto.getTraindetail());
		model.addAttribute("ticketfare",traindto.getTicketfare());
		return "train-detail-ticket-fare";
	}
	@GetMapping("/findtrainticketbook")
	public String findTrainTicketBook() {
	   
		return "findtrainticketform";
	}
	@GetMapping("/gettrainticketbook")
	public String getTrainDetailAndTicket(@RequestParam("TrainNo")int id,Model model) {
		TrainDetailAndTicketDTO traindetail =traindetailservice.getTrainDetailAndTicketDTO(id);
		model.addAttribute("traindetail1",traindetail.getTrainDetail());
		model.addAttribute("ticket",traindetail.getTicket());
		return "train-detail-and-ticket-book";
	}


}

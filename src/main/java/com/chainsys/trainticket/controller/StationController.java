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

import com.chainsys.trainticket.dto.StationAndTrainDetailDTO;
import com.chainsys.trainticket.model.Station;
import com.chainsys.trainticket.service.StationService;
import com.chainsys.trainticket.service.TicketFareService;

@Controller
@RequestMapping("/station")
public class StationController {
	@Autowired
	StationService stservice;
	@Autowired
	TicketFareService ticketFareService;
	
	@GetMapping("/liststation")
	public String getStations(Model model) {
		List<Station> theSt =stservice.getStations();
		model.addAttribute("allstations", theSt);
		return "list-station";
	}
	@GetMapping("/addstationform")
	public String showAddForm(Model model) {
		Station theSn = new Station();
		model.addAttribute("newstation", theSn);
		return "add-station-form";
	}

	@PostMapping("/addstation")
	public String addstation(@Valid @ModelAttribute("newstation") Station theSn,Errors errors) {
		if(errors.hasErrors()) {
			return "add-station-form";
		}
		stservice.save(theSn);
		return "redirect:/station/liststation";
	}
	@GetMapping("/modifystation")
	public String updateUser() {
	   
		return "modifystationform";
	}
	@GetMapping("/updatestationform")
	public String showUpdateForm(@RequestParam("stationId") String id, Model model) {
		Optional<Station> theSn = stservice.findByid(id);
		model.addAttribute("updatestn", theSn);
		return "update-station-form";
	}

	@PostMapping("/updatestation")
	public String modifystation(@Valid @ModelAttribute("updatestn") Station theSn,Errors errors) {
		if(errors.hasErrors()) {
			return "update-station-form";
		}
	 stservice.save(theSn);
		return "redirect:/station/liststation";
  }
	@GetMapping("/removestation")
	public String updateStation() {
	   
		return "deletestationform";
	}
	@GetMapping("/deletestation")
	public String deletestation(@RequestParam(name = "stationId") String id) {
		stservice.deleteById(id);
		return "redirect:/station/liststation";
	}
	@GetMapping("/findstation")
	public String findStation() {
	   
		return "findstationform";
	}

	@GetMapping("/getstationbyid")
	public String getstation(@RequestParam("stationId") String id, Model model) {
		Optional<Station> sn = stservice.findByid(id);
		model.addAttribute("getuserbystnid", sn);
		return "find-station-by-id";
	}
	@GetMapping("/findstationstartplace")
	public String findStationStartPlace() {
	   
		return "station-startplace-form";
	}
	@GetMapping("/getstationstartplace")
	public String getStationAndTrainDetail(@RequestParam("name")String name,Model model) {
		StationAndTrainDetailDTO dto=stservice.getStationAndTrainDetailDTO(name);
		model.addAttribute("station",dto.getStation());
		model.addAttribute("traindetail",dto.getTraindetail());
		return "station-train-detail";
	}
	@GetMapping("/getstationdestination")
	public String getStationAndTrainDetailDestination(@RequestParam("name")String name,Model model) {
		StationAndTrainDetailDTO dto=stservice.getStationAndTrainDetailDTO(name);
		model.addAttribute("station",dto.getStation());
		model.addAttribute("traindetail",dto.getTraindetail());
		return "station-train-detail";
	}
}

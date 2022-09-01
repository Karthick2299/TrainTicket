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
	
	public static final String LISTSTATION ="redirect:/station/liststation";
	
	@Autowired
	StationService stationservice;
	@Autowired
	TicketFareService ticketFareService;
	
	@GetMapping("/liststation")
	public String getStations(Model model) {
		List<Station> station =stationservice.getStations();
		model.addAttribute("allstations", station);
		return "list-station";
	}
	@GetMapping("/addstationform")
	public String showAddForm(Model model) {
		Station station = new Station();
		model.addAttribute("newstation", station);
		return "add-station-form";
	}

	@PostMapping("/addstation")
	public String addstation(@Valid @ModelAttribute("newstation") Station station,Errors errors) {
		if(errors.hasErrors()) {
			return "add-station-form";
		}
		stationservice.save(station);
		return LISTSTATION;
	}
	@GetMapping("/modifystation")
	public String updateUser() {
	   
		return "modifystationform";
	}
	@GetMapping("/updatestationform")
	public String showUpdateForm(@RequestParam("stationId") String id, Model model) {
		Optional<Station> station = stationservice.findByid(id);
		model.addAttribute("updatestn", station);
		return "update-station-form";
	}

	@PostMapping("/updatestation")
	public String modifystation(@Valid @ModelAttribute("updatestn") Station station,Errors errors) {
		if(errors.hasErrors()) {
			return "update-station-form";
		}
	 stationservice.save(station);
		return LISTSTATION;
  }
	@GetMapping("/removestation")
	public String updateStation() {
	   
		return "deletestationform";
	}
	@GetMapping("/deletestation")
	public String deletestation(@RequestParam(name = "stationId") String id) {
		stationservice.deleteById(id);
		return LISTSTATION;
	}
	@GetMapping("/findstation")
	public String findStation() {
	   
		return "findstationform";
	}

	@GetMapping("/getstationbyid")
	public String getstation(@RequestParam("stationId") String id, Model model) {
		Optional<Station> station = stationservice.findByid(id);
		model.addAttribute("getuserbystnid", station);
		return "find-station-by-id";
	}
	@GetMapping("/findstationstartplace")
	public String findStationStartPlace() {
	   
		return "station-startplace-form";
	}
	@GetMapping("/getstationstartplace")
	public String getStationAndTrainDetail(@RequestParam("fromstation")String name,@RequestParam("tostation")String value,Model model) {
		StationAndTrainDetailDTO dto=stationservice.getStationAndTrainDetailDTO(name, value);
		model.addAttribute("station",dto.getStation());
		model.addAttribute("traindetail",dto.getTraindetail());
		return "station-train-detail";
	}
	
}

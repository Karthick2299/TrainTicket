package com.chainsys.trainticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.trainticket.pojo.Station;
import com.chainsys.trainticket.service.StationService;

@Controller
@RequestMapping("/station")
public class StationController {
	@Autowired
	StationService stservice;
	
	@GetMapping("/list")
	public String getStations(Model model) {
		List<Station> theSt =stservice.getStations();
		model.addAttribute("allstations", theSt);
		return "list-station";
	}
	

}

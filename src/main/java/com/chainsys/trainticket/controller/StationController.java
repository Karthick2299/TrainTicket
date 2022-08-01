package com.chainsys.trainticket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.trainticket.model.Station;
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
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		Station theSn = new Station();
		model.addAttribute("newstation", theSn);
		return "add-station-form";
	}

	@PostMapping("/addstation")
	public String addstation(@ModelAttribute("newstation") Station theSn) {
		stservice.save(theSn);
		return "redirect:/station/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("station_id") String id, Model model) {
		Optional<Station> theSn = stservice.findByid(id);
		model.addAttribute("updatestn", theSn);
		return "update-station-form";
	}

	@PostMapping("/updatestation")
	public String modifystation(@ModelAttribute("updatestn") Station theSn) {
	 stservice.save(theSn);
		return "redirect:/station/list";
  }
	@GetMapping("/deletestation")
	public String deletestation(@RequestParam("station_id") String id) {
		stservice.deleteById(id);
		return "redirect:/station/list";
	}

	@GetMapping("/getstationbyid")
	public String getstation(@RequestParam("station_id") String id, Model model) {
		Optional<Station> sn = stservice.findByid(id);
		model.addAttribute("getuserbystnid", sn);
		return "find-station-by-id";
	}

}

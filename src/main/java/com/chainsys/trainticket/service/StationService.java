package com.chainsys.trainticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.StationRepository;
import com.chainsys.trainticket.pojo.Station;

@Service
public class StationService {
	 @Autowired
	 private  StationRepository strepo;
	 
	 public List<Station>getStations(){
		 List<Station> listSt = strepo.findAll();
		 return listSt;
	 }
}

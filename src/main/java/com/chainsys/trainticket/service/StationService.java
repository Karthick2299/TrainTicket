package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.StationRepository;
import com.chainsys.trainticket.model.Station;

@Service
public class StationService {
	 @Autowired
	 private  StationRepository stationrepo;
	 
	 public List<Station>getStations(){
		 List<Station> listSt = stationrepo.findAll();
		 return listSt;
	 }
	 @Transactional
		public Station save(Station sn)
		{
			return stationrepo.save(sn);
		}
		public Optional<Station> findByid(String id)
		{
		return stationrepo.findById(id);
		}
		@Transactional
		public void deleteById(String id)
		{
			stationrepo.deleteById(id);
		}
}

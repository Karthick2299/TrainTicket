package com.chainsys.trainticket.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dto.StationAndTrainDetailDTO;
import com.chainsys.trainticket.model.Station;
import com.chainsys.trainticket.model.TrainDetail;
import com.chainsys.trainticket.repository.StationRepository;
import com.chainsys.trainticket.repository.TrainDetailRepository;

@Service
public class StationService {
	 @Autowired
	 private  StationRepository stationrepo;
	 @Autowired
	 private TrainDetailRepository trainrepo;
	 
	 public List<Station>getStations(){
		 return stationrepo.findAll();
	 }
//	 @Transactional
		public Station save(Station sn)
		{
			return stationrepo.save(sn);
		}
		public Optional<Station> findByid(String id)
		{
		return stationrepo.findById(id);
		}
//		@Transactional
		public void deleteById(String id)
		{
			stationrepo.deleteById(id);
		}
		public StationAndTrainDetailDTO getStationAndTrainDetailDTO (String start,String end) {
			Optional<Station> station = stationrepo.findById(start);
			StationAndTrainDetailDTO dto = new StationAndTrainDetailDTO();
			dto.setStation(station);
			List<TrainDetail> traindetails =trainrepo.findAllByStartPlaceAndDestination(start,end);
			Iterator<TrainDetail> iterator = traindetails.iterator();
			while(iterator.hasNext()) {
					dto.addTrainDetail(iterator.next());	
			}
			return dto;
		}
		
}

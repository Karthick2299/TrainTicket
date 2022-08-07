package com.chainsys.trainticket.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.StationRepository;
import com.chainsys.trainticket.dao.TrainDetailRepository;
import com.chainsys.trainticket.dto.StationAndTrainDetailDTO;
import com.chainsys.trainticket.model.Station;
import com.chainsys.trainticket.model.TrainDetail;

@Service
public class StationService {
	 @Autowired
	 private  StationRepository stationrepo;
	 @Autowired
	 private TrainDetailRepository trainrepo;
	 
	 public List<Station>getStations(){
		 List<Station> listSt = stationrepo.findAll();
		 return listSt;
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
		public StationAndTrainDetailDTO getStationAndTrainDetailDTO (String name) {
			Optional<Station> station = stationrepo.findById(name);
			StationAndTrainDetailDTO dto = new StationAndTrainDetailDTO();
			dto.setStation(station);
			List<TrainDetail> traindetail = trainrepo.findByStartPlace(name);
			Iterator<TrainDetail> itr = traindetail.iterator();
			while(itr.hasNext()) {
				dto.addTrainDetail((TrainDetail)itr.next());
			}
			return dto;
		}
}

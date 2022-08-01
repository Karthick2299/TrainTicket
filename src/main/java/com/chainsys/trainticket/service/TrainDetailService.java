package com.chainsys.trainticket.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.TrainDetailRepository;
import com.chainsys.trainticket.model.TrainDetail;


@Service
public class TrainDetailService {
	 @Autowired
	 private  TrainDetailRepository traindetailrepo;
	 
	 public List<TrainDetail>getTrainDetails(){
		 List<TrainDetail> listSt = traindetailrepo.findAll();
		 return listSt;
	 }
	 @Transactional
		public TrainDetail save(TrainDetail td)
		{
			return traindetailrepo.save(td);
		}
		public TrainDetail findByid(int id)
		{
		return traindetailrepo.findById(id);
		}
		@Transactional
		public void deleteById(int id)
		{
			traindetailrepo.deleteById(id);
		}
}
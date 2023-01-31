package com.chainsys.trainticket.service;

import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dto.TrainDetailAndTicketDTO;
import com.chainsys.trainticket.dto.TrainDetailAndTicketFareDTO;
import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.TicketFare;
import com.chainsys.trainticket.model.TrainDetail;
import com.chainsys.trainticket.repository.TicketFareRepository;
import com.chainsys.trainticket.repository.TicketRepository;
import com.chainsys.trainticket.repository.TrainDetailRepository;


@Service
public class TrainDetailService {
	 @Autowired
	 private  TrainDetailRepository traindetailrepo;
	 @Autowired
	 private TicketFareRepository ticketfarerepo;
	 @Autowired
	 private TicketRepository ticketrepo;
	 
	 public List<TrainDetail>getTrainDetails(){
		 return traindetailrepo.findAll();
	 }
		public TrainDetail save(TrainDetail td)
		{
			return traindetailrepo.save(td);
		}
		public TrainDetail findByid(int id)
		{
		return traindetailrepo.findById(id);
		}
		public void deleteById(int id)
		{
			traindetailrepo.deleteById(id);
		}
		public TrainDetailAndTicketFareDTO getTrainDetailAndTicketFareDTO(int id) {
			TrainDetail  trainDetail = traindetailrepo.findById(id);
			TrainDetailAndTicketFareDTO dto = new TrainDetailAndTicketFareDTO();
			dto.setTraindetail(trainDetail);
			List<TicketFare> ticketfare = ticketfarerepo.findByTrainNo(id);
			Iterator<TicketFare> iterator = ticketfare.iterator();
			while(iterator.hasNext()) {
				dto.addTicketFare(iterator.next());
			}
			return dto;
		}
		public TrainDetailAndTicketDTO getTrainDetailAndTicketDTO(int id) {
			TrainDetail traindetail = traindetailrepo.findById(id);
			TrainDetailAndTicketDTO dto1 = new TrainDetailAndTicketDTO();
			dto1.setTrainDetail(traindetail);
			List<Ticket> ticket = ticketrepo.findByTrainNo(id);
			Iterator<Ticket> itr1 =  ticket.iterator();
			while(itr1.hasNext()) {
				dto1.addTicket( itr1.next());
			}
			return dto1;
		}
}
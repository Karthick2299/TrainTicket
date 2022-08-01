package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.TicketFareRepository;
import com.chainsys.trainticket.model.TicketFare;
@Service
public class TicketFareService {
	 @Autowired
	 private  TicketFareRepository ticketfarerepo;
	 
	 public List<TicketFare>getTicketFares(){
		 List<TicketFare> listSt = ticketfarerepo.findAll();
		 return listSt;
	 }
	 @Transactional
		public TicketFare save(TicketFare tf)
		{
			return ticketfarerepo.save(tf);
		}
		public TicketFare findByid(int id)
		{
		return ticketfarerepo.findById(id);
		}
		@Transactional
		public void deleteById(int id)
		{
			ticketfarerepo.deleteById(id);
		}

}

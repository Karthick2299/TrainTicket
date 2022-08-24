package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.compositekey.TicketFareCompositeKey;
import com.chainsys.trainticket.dao.TicketFareRepository;
import com.chainsys.trainticket.model.TicketFare;
@Service
public class TicketFareService {
	 @Autowired
	 private  TicketFareRepository ticketfarerepo;
	 
	 public List<TicketFare>getTicketFares(){
		 return ticketfarerepo.findAll();
	 }
	 @Transactional
		public TicketFare save(TicketFare tf)
		{
			return ticketfarerepo.save(tf);
		}
		public Optional<TicketFare> findByid(TicketFareCompositeKey ticketFareCompositeKey)
		{
		return ticketfarerepo.findById(ticketFareCompositeKey);
		}
		@Transactional
		public void deleteById(TicketFareCompositeKey theFare)
		{
			ticketfarerepo.deleteById(theFare);
		}
		public List<TicketFare> findByTrainNo(int theFare)
		{
		 return	 ticketfarerepo.findByTrainNo(theFare);
		}

}

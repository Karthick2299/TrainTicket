package com.chainsys.trainticket.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.TicketRepository;
import com.chainsys.trainticket.model.Ticket;


@Service
public class TicketService {
	 @Autowired
	 private  TicketRepository ticketrepo;
	 
	 public List<Ticket>getTickets(){
		 List<Ticket> listSt = ticketrepo.findAll();
		 return listSt;
	 }
	 @Transactional
		public Ticket save(Ticket tk)
		{
			return ticketrepo.save(tk);
		}
		public Ticket findByid(int id)
		{
		return ticketrepo.findById(id);
		}
		@Transactional
		public void deleteById(int id)
		{
			ticketrepo.deleteById(id);
		}
}

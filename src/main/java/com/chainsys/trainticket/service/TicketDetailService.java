package com.chainsys.trainticket.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.TicketDetailRepository;
import com.chainsys.trainticket.model.TicketDetail;


@Service
public class TicketDetailService {
	 @Autowired
	 private  TicketDetailRepository ticketdetailrepo;
	 
	 public List<TicketDetail>getTicketDetails(){
		 List<TicketDetail> listSt = ticketdetailrepo.findAll();
		 return listSt;
	 }
	 @Transactional
		public TicketDetail save(TicketDetail td)
		{
			return ticketdetailrepo.save(td);
		}
		public TicketDetail findByid(int id)
		{
		return ticketdetailrepo.findById(id);
		}
		@Transactional
		public void deleteById(int id)
		{
			ticketdetailrepo.deleteById(id);
		}

}

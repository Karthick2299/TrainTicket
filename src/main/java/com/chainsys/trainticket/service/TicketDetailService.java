package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.compositekey.TicketDetailCompositeKey;
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
		public Optional<TicketDetail> findByid(TicketDetailCompositeKey ticketdetailcompositeKey)
		{
		return ticketdetailrepo.findById(ticketdetailcompositeKey);
		}
		@Transactional
		public void deleteById(TicketDetailCompositeKey ticketDetailCompositeKey)
		{
			ticketdetailrepo.deleteById(ticketDetailCompositeKey);
		}
		public List<TicketDetail> findByTicketNo(int id){
			return ticketdetailrepo.findByTicketNo(id);
		}

}

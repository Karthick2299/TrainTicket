package com.chainsys.trainticket.service;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.PaymentDetailRepository;
import com.chainsys.trainticket.dao.TicketDetailRepository;
import com.chainsys.trainticket.dao.TicketRepository;
import com.chainsys.trainticket.dto.TicketAndPaymentDetailDTO;
import com.chainsys.trainticket.dto.TicketAndTicketDetailDTO;
import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.TicketDetail;


@Service
public class TicketService {
	 @Autowired
	 private  TicketRepository ticketrepo;
	 @Autowired
	 private PaymentDetailRepository paymentDetailRepository;
	 @Autowired
	 private TicketDetailRepository ticketDetailrepo;
	 
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
		public TicketAndPaymentDetailDTO getTicketAndPaymentDetailDTO(int id) 
		{  
		    Ticket ticket=ticketrepo.findById(id);
		    TicketAndPaymentDetailDTO dto=new TicketAndPaymentDetailDTO();
		    dto.setTicket(ticket);
		    PaymentDetail paymentDetail=paymentDetailRepository.findByTicketNo(id);
		    dto.setPaymentDetail(paymentDetail);
		    return dto;
       }
		public TicketAndTicketDetailDTO getTicketAndTicketDetailDTO(int id)
		{
			Ticket ticket1 = ticketrepo.findById(id);
			TicketAndTicketDetailDTO dto1 = new TicketAndTicketDetailDTO();
			dto1.setTicket(ticket1);
			List<TicketDetail> ticketDetail = ticketDetailrepo.findByTicketNo(id);
			Iterator<TicketDetail> itr = ticketDetail.iterator();
			while(itr.hasNext()) {
				dto1.addTicketDetail((TicketDetail)itr.next());
				}
			return dto1;
		}
}

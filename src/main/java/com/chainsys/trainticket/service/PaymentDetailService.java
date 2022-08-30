package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.compositekey.PaymentDetailCompositeKey;
import com.chainsys.trainticket.compositekey.TicketFareCompositeKey;
import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.TicketFare;
import com.chainsys.trainticket.repository.PaymentDetailRepository;
import com.chainsys.trainticket.repository.TicketFareRepository;

@Service
public class PaymentDetailService {
	 @Autowired
	 private  PaymentDetailRepository paymentdetailrepo;
	 @Autowired
	 private TicketService ticketservice;
	 @Autowired
	 private TicketFareRepository ticketFareService;
	 
	 public List<PaymentDetail>getPaymentDetails(){
		 return paymentdetailrepo.findAll();
	 }
	 @Transactional
		public PaymentDetail save(PaymentDetail td)
		{
			return paymentdetailrepo.save(td);
		}
		public Optional<PaymentDetail> findByid(PaymentDetailCompositeKey id)
		{
		return paymentdetailrepo.findById(id);
		}
		@Transactional
		public void deleteById(PaymentDetailCompositeKey id)
		{
			paymentdetailrepo.deleteById(id);
		}
public float getTotalAmount(int noOfPassengers,int ticketNo) {
			float totalAmount=0;
			Ticket ticket=ticketservice.findByid(ticketNo);
			TicketFareCompositeKey ticketFareCompositeKey=new TicketFareCompositeKey(ticket.getTrainNo(),ticket.getSeatClass());
			Optional<TicketFare> ticketfare=ticketFareService.findById(ticketFareCompositeKey);
			totalAmount=((ticketfare.get().getFare())*(noOfPassengers));
		return totalAmount;
		}
}

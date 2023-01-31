package com.chainsys.trainticket.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.Ticket;

public class TicketAndPaymentDetailDTO {
	  @Autowired
	    private Ticket ticket;
	    private PaymentDetail paymentDetail;
		public Ticket getTicket() {
			return ticket;
		}
		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}
		public PaymentDetail getPaymentDetail() {
			return paymentDetail;
		}
		public void setPaymentDetail(PaymentDetail paymentDetail) {
			this.paymentDetail = paymentDetail;
		}
	    

}

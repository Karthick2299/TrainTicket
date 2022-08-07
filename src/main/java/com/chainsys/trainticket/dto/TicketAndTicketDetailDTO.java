package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.TicketDetail;

public class TicketAndTicketDetailDTO {
	private Ticket ticket;
	private List<TicketDetail> ticketDetail = new ArrayList<TicketDetail>();
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public List<TicketDetail> getTicketDetail() {
		return ticketDetail;
	}
	public void addTicketDetail(TicketDetail ticketdetail) {
		ticketDetail.add(ticketdetail);
	}

}

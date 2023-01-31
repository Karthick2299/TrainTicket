package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.TrainDetail;

public class TrainDetailAndTicketDTO {
	private TrainDetail traindetail;
	private List<Ticket> ticketBook = new ArrayList<>();
	public TrainDetail getTrainDetail() {
		return traindetail;
	}
	public void setTrainDetail(TrainDetail trainDetail) {
		this.traindetail = trainDetail;
	}
	public List<Ticket> getTicket() {
		return ticketBook;
	}
	public void addTicket(Ticket ticket) {
		ticketBook.add(ticket);
	}

}

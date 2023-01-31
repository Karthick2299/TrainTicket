package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.trainticket.model.TicketFare;
import com.chainsys.trainticket.model.TrainDetail;

public class TrainDetailAndTicketFareDTO {
	private TrainDetail traindetail;
	private List<TicketFare> ticketfare = new ArrayList<>();
	public TrainDetail getTraindetail() {
		return traindetail;
	}
	public void setTraindetail(TrainDetail traindetail) {
		this.traindetail = traindetail;
	}
	
	public List<TicketFare> getTicketfare() {
		return ticketfare;
	}
	public void addTicketFare(TicketFare ticketFare) {
		ticketfare.add(ticketFare);
	}
	
	
	

}

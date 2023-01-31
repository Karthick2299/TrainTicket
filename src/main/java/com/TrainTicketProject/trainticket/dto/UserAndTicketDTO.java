package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.User;

public class UserAndTicketDTO {
	private User user;
	private List<Ticket> ticket = new ArrayList<>();
	public User getUser() {
		return user;
	}
	public void setUser(User user2) {
		this.user = user2;
	}
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void addTicket(Ticket userTicket) {
		ticket.add(userTicket);
	}
}

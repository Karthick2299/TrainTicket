package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.User;

public class UserAndTicketDTO {
	private Optional<User> user;
	private List<Ticket> ticket = new ArrayList<Ticket>();
	public Optional<User> getUser() {
		return user;
	}
	public void setUser(Optional<User> user) {
		this.user = user;
	}
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void addTicket(Ticket userTicket) {
		ticket.add(userTicket);
	}
}

package com.chainsys.trainticket.compositekey;

import java.io.Serializable;

public class TicketDetailCompositeKey implements Serializable {
	private int ticketNo;
	private String passengerName;
	TicketDetailCompositeKey(){
		
	}
	public TicketDetailCompositeKey(int num,String value) {
		this.ticketNo=num;
		this.passengerName=value;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
}

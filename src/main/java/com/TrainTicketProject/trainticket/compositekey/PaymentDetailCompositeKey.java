package com.chainsys.trainticket.compositekey;

import java.io.Serializable;

public class PaymentDetailCompositeKey implements Serializable{
	private int ticketNo;
	private int userId;
	PaymentDetailCompositeKey(){
		
	}
	
	public PaymentDetailCompositeKey(int number,int  id) {
		this.ticketNo=number;
		 this.userId=id;
		}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}

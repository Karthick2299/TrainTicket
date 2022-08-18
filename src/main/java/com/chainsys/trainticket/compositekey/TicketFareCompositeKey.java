package com.chainsys.trainticket.compositekey;

public class TicketFareCompositeKey {
	private int trainNo;
	private String seatClass;
	
	TicketFareCompositeKey(){
		
	}
	public TicketFareCompositeKey(int num,String value) {
		this.trainNo=num;
		this.seatClass=value;
	}
	
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	

}

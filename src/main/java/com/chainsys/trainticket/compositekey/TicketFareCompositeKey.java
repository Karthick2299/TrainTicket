package com.chainsys.trainticket.compositekey;

import java.io.Serializable;
import java.util.Objects;

public class TicketFareCompositeKey implements Serializable {
	private int trainNo;
	private String seatClass;
	
	public TicketFareCompositeKey(){
		
	}
	public TicketFareCompositeKey(int num,String value) {
		this.trainNo=num;
		this.seatClass=value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(seatClass, trainNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketFareCompositeKey other = (TicketFareCompositeKey) obj;
		return Objects.equals(seatClass, other.seatClass) && trainNo == other.trainNo;
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

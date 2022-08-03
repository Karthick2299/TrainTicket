package com.chainsys.trainticket.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentdetails")
public class PaymentDetail {
	@Id
	@Column(name="ticket_no")
	private float ticketNo;
	@Column(name="user_id")
	private String userId;
	@Column(name="receipt_no")
	private String receiptNo ;
	@Column(name="amount")
	private int amount;
	@Column(name="mode_of_payment")
	private String modeOfPayment ;
	@Column(name="payment_details")
	private String paymentDetails ;
	@Column(name="payment_date")
	private Date paymentDate; 
	public float getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(float ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
}

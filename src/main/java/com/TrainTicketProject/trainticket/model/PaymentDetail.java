package com.chainsys.trainticket.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="paymentdetails")
@IdClass(com.chainsys.trainticket.compositekey.PaymentDetailCompositeKey.class)
public class PaymentDetail {
	@Id
	@Column(name="ticket_no")
	private int ticketNo;
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="amount")
	private float amount;
	
	@Column(name="mode_of_payment")
	@NotBlank(message = "*Please Select Payment Mode")
	private String modeOfPayment ;
	
	@Column(name="payment_details")
	@NotEmpty(message = "Please Enter Payment Details")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "*Value should be in Alphabets ")
	private String paymentDetails ;
	
	@Column(name="payment_date")
	private Date paymentDate; 
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="ticket_no", nullable = false, insertable = false, updatable = false)
    private Ticket ticket;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false,insertable=false,updatable=false)
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
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

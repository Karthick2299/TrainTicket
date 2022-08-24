package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.User;

public class UserAndPaymentDetailDTO {
	private User user;
	private List<PaymentDetail> paymentDetail = new ArrayList<>();
	public User getUser() {
		return user;
	}
	public void setUser(User user2) {
		this.user = user2;
	}
	public List<PaymentDetail> getPaymentDetail() {
		return paymentDetail;
	}
	public void addPaymentDetail(PaymentDetail paymentdetail) {
		paymentDetail.add(paymentdetail);
	}
}

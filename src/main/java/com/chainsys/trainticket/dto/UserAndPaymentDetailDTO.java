package com.chainsys.trainticket.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.User;

public class UserAndPaymentDetailDTO {
	private Optional<User> user;
	private List<PaymentDetail> paymentDetail = new ArrayList<PaymentDetail>();
	public Optional<User> getUser() {
		return user;
	}
	public void setUser(Optional<User> user) {
		this.user = user;
	}
	public List<PaymentDetail> getPaymentDetail() {
		return paymentDetail;
	}
	public void addPaymentDetail(PaymentDetail paymentdetail) {
		paymentDetail.add(paymentdetail);
	}
}

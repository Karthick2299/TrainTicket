package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.compositekey.PaymentDetailCompositeKey;
import com.chainsys.trainticket.dao.PaymentDetailRepository;
import com.chainsys.trainticket.model.PaymentDetail;

@Service
public class PaymentDetailService {
	 @Autowired
	 private  PaymentDetailRepository paymentdetailrepo;
	 
	 public List<PaymentDetail>getPaymentDetails(){
		 List<PaymentDetail> listSt = paymentdetailrepo.findAll();
		 return listSt;
	 }
	 @Transactional
		public PaymentDetail save(PaymentDetail td)
		{
			return paymentdetailrepo.save(td);
		}
		public Optional<PaymentDetail> findByid(PaymentDetailCompositeKey id)
		{
		return paymentdetailrepo.findById(id);
		}
		@Transactional
		public void deleteById(PaymentDetailCompositeKey id)
		{
			paymentdetailrepo.deleteById(id);
		}

}

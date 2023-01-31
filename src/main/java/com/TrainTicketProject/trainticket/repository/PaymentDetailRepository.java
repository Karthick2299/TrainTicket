package com.chainsys.trainticket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.compositekey.PaymentDetailCompositeKey;
import com.chainsys.trainticket.model.PaymentDetail;


public interface PaymentDetailRepository extends CrudRepository<PaymentDetail,PaymentDetailCompositeKey> {
	Optional<PaymentDetail> findById(PaymentDetailCompositeKey id);
 	
	PaymentDetail save(PaymentDetail pd);
 	
 	
 	void deleteById(PaymentDetailCompositeKey paymentDetailCompositeKey);
 	
 	List<PaymentDetail> findAll(); 

 
 	PaymentDetail findByTicketNo  (int id);
 	
 	List<PaymentDetail> findByUserId(int value);
}
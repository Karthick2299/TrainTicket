package com.chainsys.trainticket.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.PaymentDetail;


public interface PaymentDetailRepository extends CrudRepository<PaymentDetail,Integer> {
	PaymentDetail findById(int id);
 	
	PaymentDetail save(PaymentDetail pd);
 	
 	
 	void deleteById(int id);
 	
 	List<PaymentDetail> findAll(); 

 //	PaymentDetail findByUserId  (String string);
 	PaymentDetail findByTicketNo  (int id);
}
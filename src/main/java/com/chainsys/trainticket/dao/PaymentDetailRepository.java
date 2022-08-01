package com.chainsys.trainticket.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.PaymentDetail;


public interface PaymentDetailRepository extends CrudRepository<PaymentDetail,Integer> {
	PaymentDetail findById(int id);
 	
	PaymentDetail save(PaymentDetail pd);
 	
 	// Used for adding new doctor
 	void deleteById(int id);
 	
 	List<PaymentDetail> findAll(); 

}
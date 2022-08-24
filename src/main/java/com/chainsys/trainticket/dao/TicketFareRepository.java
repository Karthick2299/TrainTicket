package com.chainsys.trainticket.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.compositekey.TicketFareCompositeKey;
import com.chainsys.trainticket.model.TicketFare;


public interface TicketFareRepository  extends CrudRepository<TicketFare,TicketFareCompositeKey> {
 	Optional<TicketFare> findById(TicketFareCompositeKey theFare);
 	
 	TicketFare save(TicketFare tf);
 	
 	void deleteById(TicketFareCompositeKey theFare);
 	
 	List<TicketFare> findAll(); 
 	
 	List<TicketFare> findByTrainNo(int id);


}

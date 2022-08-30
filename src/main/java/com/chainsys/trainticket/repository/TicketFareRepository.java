package com.chainsys.trainticket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.compositekey.TicketFareCompositeKey;
import com.chainsys.trainticket.model.TicketFare;


public interface TicketFareRepository  extends CrudRepository<TicketFare,TicketFareCompositeKey> {
 	Optional<TicketFare> findById(TicketFareCompositeKey ticketFare);
 	
 	TicketFare save(TicketFare fare);
 	
 	void deleteById(TicketFareCompositeKey ticketFare);
 	
 	List<TicketFare> findAll(); 
 	
 	List<TicketFare> findByTrainNo(int id);


}

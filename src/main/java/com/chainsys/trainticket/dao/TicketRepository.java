package com.chainsys.trainticket.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.Ticket;


public interface TicketRepository extends CrudRepository<Ticket,String> {
	Optional<Ticket> findById(String id);
	
	Ticket save(Ticket tk);
	
	void deleteById(String id);
	
	List<Ticket> findAll(); 
	
}
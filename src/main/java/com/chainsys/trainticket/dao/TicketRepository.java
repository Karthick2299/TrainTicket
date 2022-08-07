package com.chainsys.trainticket.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.Ticket;


public interface TicketRepository extends CrudRepository<Ticket,Integer> {
	Ticket findById(int id);
	
	Ticket save(Ticket tk);
	
	void deleteById(int id);
	
	List<Ticket> findAll(); 
	
	List<Ticket> findByTrainNo(int id);
	
	List<Ticket> findByUserId(String number);
	
}
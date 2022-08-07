package com.chainsys.trainticket.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.TicketDetail;

public interface TicketDetailRepository extends CrudRepository<TicketDetail,Integer> {
 	TicketDetail findById(int id);
 	
 	TicketDetail save(TicketDetail td);
 	
 	void deleteById(int id);
 	
 	List<TicketDetail> findAll(); 
 	
 	List<TicketDetail> findByTicketNo(int id);

}
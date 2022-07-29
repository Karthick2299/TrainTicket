package com.chainsys.trainticket.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.pojo.Station;

public interface StationRepository extends CrudRepository<Station,Integer>  {

  Station findById(int id);
	
	Station save(Station sn);
	
	void deleteById(int id);
	
	List<Station> findAll();
}

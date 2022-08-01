package com.chainsys.trainticket.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.Station;

public interface StationRepository extends CrudRepository<Station,String>  {

  Optional<Station> findById(String id);
	
	
	Station save(Station sn);
	
	void deleteById(String id);
	
	List<Station> findAll();
}

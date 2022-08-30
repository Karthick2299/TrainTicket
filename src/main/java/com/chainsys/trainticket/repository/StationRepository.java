package com.chainsys.trainticket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.Station;

public interface StationRepository extends CrudRepository<Station,String>  {

  Optional<Station> findById(String id);
	
	
	Station save(Station station);
	
	void deleteById(String id);
	
	List<Station> findAll();
}

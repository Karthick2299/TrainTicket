package com.chainsys.trainticket.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.User;

public interface UserRepository extends CrudRepository<User,String> {
	Optional<User> findById(String id);
	
	User save(User us);
	
	void deleteById(String id);
	
	List<User> findAll(); 
	
}

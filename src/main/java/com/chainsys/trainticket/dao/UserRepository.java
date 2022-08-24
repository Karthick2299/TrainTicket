package com.chainsys.trainticket.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	User findById(int id);
	
	User save(User ur);
	
	void deleteById(int id);
	
	List<User> findAll(); 
	
	User findByUserNameAndUserPassword(String id,String password);
	
}

package com.chainsys.trainticket.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	User findById(int id);
	
	User save(User user);
	
	void deleteById(int id);
	
	List<User> findAll(); 
	
	User findByUserNameAndUserPassword(String id,String password);
	
}

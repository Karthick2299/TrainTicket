package com.chainsys.trainticket.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.trainticket.pojo.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	User findById(int id);
	
	User save(User us);
	
	void deleteById(int id);
	
	List<User> findAll(); 
	
}

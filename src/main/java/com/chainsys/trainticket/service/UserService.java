package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.UserRepository;
import com.chainsys.trainticket.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository rep;
	
	public List<User> getUsers(){
		List<User> listUs=rep.findAll();
		return listUs;
	}
	@Transactional
	public User save(User ur)
	{
		return rep.save(ur);
	}
	public Optional<User> findByid(String id)
	{
	return rep.findById(id);
	}
	@Transactional
	public void deleteById(String id)
	{
		rep.deleteById(id);
	}


}

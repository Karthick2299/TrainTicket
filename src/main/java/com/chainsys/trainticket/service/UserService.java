package com.chainsys.trainticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.UserRepository;
import com.chainsys.trainticket.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserRepository rep;
	
	public List<User> getUsers(){
		List<User> listUs=rep.findAll();
		return listUs;
	}

}

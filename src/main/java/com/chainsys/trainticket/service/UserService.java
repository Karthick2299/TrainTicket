package com.chainsys.trainticket.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.PaymentDetailRepository;
import com.chainsys.trainticket.dao.UserRepository;
import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepo;
	@Autowired
	private PaymentDetailRepository paymentrepo;
	
	public List<User> getUsers(){
		List<User> listUs=userrepo.findAll();
		return listUs;
	}
	@Transactional
	public User save(User theUr)
	{
		return userrepo.save(theUr);
	}
	public Optional<User> findByid(String id)
	{
	return userrepo.findById(id);
	}
	@Transactional
	public void deleteById(String id)
	{
		userrepo.deleteById(id);
	}
	



}

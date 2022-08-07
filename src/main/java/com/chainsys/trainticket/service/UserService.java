package com.chainsys.trainticket.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.trainticket.dao.PaymentDetailRepository;
import com.chainsys.trainticket.dao.TicketRepository;
import com.chainsys.trainticket.dao.UserRepository;
import com.chainsys.trainticket.dto.UserAndPaymentDetailDTO;
import com.chainsys.trainticket.dto.UserAndTicketDTO;
import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepo;
	@Autowired
	private PaymentDetailRepository paymentrepo;
	@Autowired
	private TicketRepository ticketrepo;
	
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
	public UserAndTicketDTO getUserAndTicketDTO(String username) {
		Optional<User> user = userrepo.findById(username);
		UserAndTicketDTO dto = new UserAndTicketDTO();
		dto.setUser(user);
		List<Ticket> ticket = ticketrepo.findByUserId(username);
		Iterator<Ticket> iterator = ticket.iterator();
		while(iterator.hasNext()) {
			dto.addTicket((Ticket)iterator.next());
		}
		return dto;
	}
	public UserAndPaymentDetailDTO getUserAndPaymentDetailDTO(String name) {
		Optional<User> user = userrepo.findById(name);
		UserAndPaymentDetailDTO dto1 = new UserAndPaymentDetailDTO();
		dto1.setUser(user);
		List<PaymentDetail> paymentdetail = paymentrepo.findByUserId(name);
		Iterator<PaymentDetail> itr = paymentdetail.iterator();
		while(itr.hasNext()) {
			dto1.addPaymentDetail((PaymentDetail)itr.next());
		}
		return dto1;
	}



}

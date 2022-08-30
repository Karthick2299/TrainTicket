package com.chainsys.trainticket.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.trainticket.businesslogic.Logic;
import com.chainsys.trainticket.compositekey.PaymentDetailCompositeKey;
import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.model.Ticket;
import com.chainsys.trainticket.model.TicketDetail;
import com.chainsys.trainticket.service.PaymentDetailService;
import com.chainsys.trainticket.service.TicketDetailService;
import com.chainsys.trainticket.service.TicketService;


@Controller
@RequestMapping("/paymentdetail")
public class PaymentDetailController {
	@Autowired
	PaymentDetailService pdservice;
	 @Autowired
	 private TicketDetailService ticketDetailService;
	 @Autowired
	 private TicketService ticketService;
	 
		@GetMapping("/listpayment")
		public String getPaymentDetails(Model model) {
			List<PaymentDetail> payment =pdservice.getPaymentDetails();
			model.addAttribute("allpayments", payment);
			return "list-payment-detail-form";
		}
		@GetMapping("/addform")
		public String addPaymentForm(@RequestParam("ticketNo")int ticketNo,Model model) {
			PaymentDetail thePd = new PaymentDetail();
			thePd.setTicketNo(ticketNo);
			List<TicketDetail> ticketdetails=ticketDetailService.findByTicketNo(ticketNo);
			Ticket ticket=ticketService.findByid(ticketNo);
			thePd.setUserId(ticket.getUserId());
			thePd.setAmount(pdservice.getTotalAmount(ticketdetails.size(), ticketNo));
			thePd.setPaymentDate(Logic.getInstanceDate());
			model.addAttribute("newpayment", thePd);
			return "add-payment-detail-form";
		}
		
		@PostMapping("/addpayment")
		public String addstation(@Valid @ModelAttribute("newpayment") PaymentDetail payment,Errors errors) {
			if (errors.hasErrors()) {
				return "add-payment-detail-form";
			}
			pdservice.save(payment);
			return "submit";
		}
		
		@GetMapping("/updatepayment")
		public String updatePayment() {
		   
			return "modifypaymentform";
		}
		@GetMapping("/updateform")
		public String updatePaymentform(@RequestParam("ticketNo") int id,@RequestParam("userId") int name, Model model) {
			PaymentDetailCompositeKey paymentDetailCompositeKey=new PaymentDetailCompositeKey(id,name);
			Optional<PaymentDetail> payment = pdservice.findByid(paymentDetailCompositeKey);
			model.addAttribute("updatepayment", payment);
			return "update-payment-detail-form";
		}

		@PostMapping("/modifypayment")
		public String modifyPayment(@Valid @ModelAttribute("updatepayment") PaymentDetail payment,Errors errors) {
			if (errors.hasErrors()) {
				return "update-payment-detail-form";
			}
		 pdservice.save(payment);
			return "redirect:/paymentdetail/listpayment";
	  }
		@GetMapping("/removepayment")
		public String deletePayment() {
		   
			return "deletepaymentform";
		}
		@GetMapping("/deletepayment")
		public String deletePayment(@RequestParam("ticketNo") int id,@RequestParam("userId")int name) {
			PaymentDetailCompositeKey paymentDetailcompositeKey =new PaymentDetailCompositeKey(id,name); 
			pdservice.deleteById(paymentDetailcompositeKey);
			return "redirect:/paymentdetail/listpayment";
		}
		@GetMapping("/findpayment")
		public String getPayment() {
		   
			return "findpaymentform";
		}

		@GetMapping("/getpaymentbyno")
		public String getPayment(@RequestParam("ticketNo") int id,@RequestParam("userId")int name1, Model model) {
			PaymentDetailCompositeKey paymentdetailcompositeKey = new PaymentDetailCompositeKey(id,name1);
			Optional<PaymentDetail> payment = pdservice.findByid(paymentdetailcompositeKey);
			model.addAttribute("getpaymentbytktno", payment);
			return "find-payment-by-ticket-num";
		}
		@GetMapping("/submitbut")
		public String getSubmit(Model model) {
			
			return "submit";
		}

	}


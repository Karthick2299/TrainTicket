package com.chainsys.trainticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.trainticket.model.PaymentDetail;
import com.chainsys.trainticket.service.PaymentDetailService;


@Controller
@RequestMapping("/paymentdetail")
public class PaymentDetailController {
	@Autowired
	PaymentDetailService pdservice;
	
	@GetMapping("/listpayment")
	public String getPaymentDetails(Model model) {
		List<PaymentDetail> thePd =pdservice.getPaymentDetails();
		model.addAttribute("allpayments", thePd);
		return "list-Payment-detail-form";
	}
	@GetMapping("/addform")
	public String AddPaymentForm(Model model) {
		PaymentDetail thePd = new PaymentDetail();
		model.addAttribute("newpayment", thePd);
		return "add-payment-detail-form";
	}

	@PostMapping("/addpayment")
	public String addstation(@ModelAttribute("newpayment") PaymentDetail thePd) {
		pdservice.save(thePd);
		return "redirect:/paymentdetails/listpayment";
	}
	@GetMapping("/updateform")
	public String UpdatePaymentorm(@RequestParam("ticketNo") int id, Model model) {
		PaymentDetail thePd = pdservice.findByid(id);
		model.addAttribute("updatepayment", thePd);
		return "update-payment-detail-form";
	}

	@PostMapping("/modifypayment")
	public String modifystation(@ModelAttribute("updatepayment") PaymentDetail thePd) {
	 pdservice.save(thePd);
		return "redirect:/paymentdetails/listpayment";
  }
	@GetMapping("/deletepayment")
	public String deletestation(@RequestParam("ticketNo") int id) {
		pdservice.deleteById(id);
		return "redirect:/paymentdetails/listpayment";
	}

	@GetMapping("/getpaymentbyno")
	public String getstation(@RequestParam("ticketNo") int id, Model model) {
		PaymentDetail pd = pdservice.findByid(id);
		model.addAttribute("getpaymentbytktno", pd);
		return "find-payment-by-ticket-num";
	}

}

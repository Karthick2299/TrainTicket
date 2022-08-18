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

import com.chainsys.trainticket.compositekey.PaymentDetailCompositeKey;
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
		return "list-payment-detail-form";
	}
	@GetMapping("/addform")
	public String addPaymentForm(Model model) {
		PaymentDetail thePd = new PaymentDetail();
		model.addAttribute("newpayment", thePd);
		return "add-payment-detail-form";
	}

	@PostMapping("/addpayment")
	public String addstation(@Valid @ModelAttribute("newpayment") PaymentDetail thePd,Errors errors) {
		if (errors.hasErrors()) {
			return "add-payment-detail-form";
		}
		pdservice.save(thePd);
		return "redirect:/ticket/getticketandpayment";
	}
	@GetMapping("/updatepayment")
	public String updatePayment() {
	   
		return "modifypaymentform";
	}
	@GetMapping("/updateform")
	public String updatePaymentform(@RequestParam("ticketNo") int id,@RequestParam("userid") int name, Model model) {
		PaymentDetailCompositeKey paymentDetailCompositeKey=new PaymentDetailCompositeKey(id,name);
		Optional<PaymentDetail> thePd = pdservice.findByid(paymentDetailCompositeKey);
		model.addAttribute("updatepayment", thePd);
		return "update-payment-detail-form";
	}

	@PostMapping("/modifypayment")
	public String modifyPayment(@Valid @ModelAttribute("updatepayment") PaymentDetail thePd,Errors errors) {
		if (errors.hasErrors()) {
			return "update-payment-detail-form";
		}
	 pdservice.save(thePd);
		return "redirect:/paymentdetail/listpayment";
  }
	@GetMapping("/removepayment")
	public String deletePayment() {
	   
		return "deletepaymentform";
	}
	@GetMapping("/deletepayment")
	public String deletePayment(@RequestParam("ticketNo") int id,@RequestParam("userid")int name) {
		PaymentDetailCompositeKey paymentDetailcompositeKey =new PaymentDetailCompositeKey(id,name); 
		pdservice.deleteById(paymentDetailcompositeKey);
		return "redirect:/paymentdetail/listpayment";
	}
	@GetMapping("/findpayment")
	public String getPayment() {
	   
		return "findpaymentform";
	}

	@GetMapping("/getpaymentbyno")
	public String getPayment(@RequestParam("ticketNo") int id,@RequestParam("userid")int name1, Model model) {
		PaymentDetailCompositeKey paymentdetailcompositeKey = new PaymentDetailCompositeKey(id,name1);
		Optional<PaymentDetail> pd = pdservice.findByid(paymentdetailcompositeKey);
		model.addAttribute("getpaymentbytktno", pd);
		return "find-payment-by-ticket-num";
	}

}

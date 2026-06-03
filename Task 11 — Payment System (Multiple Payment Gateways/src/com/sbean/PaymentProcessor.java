package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PaymentProcessor {

	private PaymentService paymentService;
	
	
	
	@Autowired
	public PaymentProcessor(@Qualifier("googlePayService")PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}



	public String processPayment(double amount) {
		paymentService.pay(amount);
		return"Paid: "+amount;
	}








}

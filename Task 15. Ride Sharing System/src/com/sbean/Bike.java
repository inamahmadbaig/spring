package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Interfaces.PaymentMethod;
import com.Interfaces.Vehicle;
@Component
public class Bike implements Vehicle{

	@Autowired
	@Qualifier("walletPayment")
	private PaymentMethod paymentMethod;
	@Override
	public String ride() {
		return "Bike is book ride started";
	}
	
	public PaymentMethod getPay() {
		return paymentMethod;
		
	}

}

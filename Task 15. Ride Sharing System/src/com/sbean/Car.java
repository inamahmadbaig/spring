package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Interfaces.PaymentMethod;
import com.Interfaces.Vehicle;
@Component
public class Car implements Vehicle{

	@Autowired
	@Qualifier("cardPayment")
	private PaymentMethod paymentMethod;
	@Override
	public String ride() {
		return "Car is book ride started";
	}

	public PaymentMethod getPay() {
		return paymentMethod;
		
	}
}

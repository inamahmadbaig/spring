package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class GooglePayService implements PaymentService {
	
	@Override
	public void pay(double amount) {
		System.out.println("Paid using GooglePay");
	}

}

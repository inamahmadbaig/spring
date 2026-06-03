package com.sbean;

public class PaytmPaymentService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Paid using Paytm");
	}

}

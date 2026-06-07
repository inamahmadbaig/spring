package com.sbean;

import org.springframework.stereotype.Component;

import com.Interfaces.PaymentMethod;

@Component
public class WalletPayment implements PaymentMethod {

	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Paid "+amount+" using Wallet";
	}

}

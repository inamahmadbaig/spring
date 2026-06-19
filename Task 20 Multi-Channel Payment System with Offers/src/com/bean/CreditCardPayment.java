package com.bean;

import org.springframework.stereotype.Component;

import com.Interface.Payment;
@Component("credit")
public class CreditCardPayment implements Payment {
	double Discount;
	@Override
	public String pay(double amount) {
		this.Discount= calculateDiscount(amount);
		return "Paid "+(amount - Discount)+" using Credit Card";
	}
	private double calculateDiscount(double amount) {
		return amount * 0.10;
	}
}
//Credit Card → 10% discount
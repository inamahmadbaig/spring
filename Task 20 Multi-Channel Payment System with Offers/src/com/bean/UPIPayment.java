package com.bean;

import org.springframework.stereotype.Component;

import com.Interface.Payment;
@Component("upi")
public class UPIPayment implements Payment {
	double Discount;
	@Override
	public String pay(double amount) {
		this.Discount= calculateDiscount(amount);
		return "Paid "+(amount - Discount)+" using UPI";
	}
	private double calculateDiscount(double amount) {
		return amount * 0.15;
	}
}
//UPI → 10% discount
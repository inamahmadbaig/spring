package com.bean;

import org.springframework.stereotype.Component;

import com.Interface.Payment;
@Component("debit")
public class DebitCardPayment implements Payment {
	double Discount;
	@Override
	public String pay(double amount) {
		this.Discount= calculateDiscount(amount);
		return "Paid "+(amount - Discount)+ " using Debit Card";
	}
	private double calculateDiscount(double amount) {
		return amount * 0.05;
	}
}
//Debit  Card → 5% discount



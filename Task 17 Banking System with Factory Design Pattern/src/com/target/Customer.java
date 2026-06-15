package com.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Interface.Bank;
import com.Interface.BankFactory;
@Component
public class Customer {
	private int customerId;
	private String customerName;
	private Bank bank;
	
	@Autowired
	BankFactory bankFactory;
	
	
	public BankFactory getBankFactory() {
		return bankFactory;
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setBank(String bankType) {
		this.bank= bankFactory.createBank(bankType);
	}
	
	public void deposit(double amount) {
		System.out.println(bank.deposit(amount));
	}
	
	public void withdraw(double amount) {
		System.out.println(bank.withdraw(amount));
	}
	
	public void displayDetails() {
		System.out.println(" \tCustomer ID: "+customerId);
		System.out.println(" \tCustomer Name "+customerName);
		System.out.println(bank.toString());
	}
	
}

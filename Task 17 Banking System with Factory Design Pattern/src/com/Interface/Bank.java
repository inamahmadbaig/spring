package com.Interface;

public interface Bank {
	double getAmount();
	void setAmount(double amount);
	String deposit(double amount);
	String withdraw(double amount);

}

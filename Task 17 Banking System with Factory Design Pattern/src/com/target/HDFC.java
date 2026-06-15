package com.target;

import org.springframework.stereotype.Component;

import com.Interface.Bank;
@Component
public class HDFC implements Bank{
	private double amount;

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount=amount;
	}

	@Override
	public String deposit(double amount) {
		this.amount= this.amount+amount;
		return "\t₹ "+amount + " deposited in SBI. Balance: ₹\" + "+this.amount;
	}

	@Override
	public String withdraw(double amount) {
		if (amount > this.amount) {
            return "Insufficient balance in SBI!";
        }
        this.amount = this.amount-amount;
        return "\t₹ " + amount + " withdrawn from SBI. Balance: ₹" + this.amount;
	}

	@Override
	public String toString() {
		return " \tHDFC Balance = " + amount ;
	}
	
}

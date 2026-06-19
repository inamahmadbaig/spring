package com.bean;


import com.interfac.InterestStrategy;

public class CarLoanInterest implements InterestStrategy {
	double rate = 9.0;
	double processingFee = 2000;
	@Override
	public double calculateInterest(double principal, int timeInYears) {

		double simpleInterest =(principal * rate * timeInYears)/100;
		double finalAmount = simpleInterest + processingFee; 
		
		return finalAmount;
	}

}

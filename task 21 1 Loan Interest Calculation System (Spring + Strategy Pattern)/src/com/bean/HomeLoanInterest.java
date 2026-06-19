package com.bean;

import com.interfac.InterestStrategy;

public class HomeLoanInterest implements InterestStrategy {
	double rate = 7.0;
	@Override
	public double calculateInterest(double principal, int timeInYears) {

		double SimpleInterest =(principal * rate * timeInYears)/100;
		
		return SimpleInterest;
	}

}

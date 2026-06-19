package com.bean;


import com.interfac.InterestStrategy;

public class PersonalLoanInterest implements InterestStrategy {
	double rate = 12.0;
	double riskSurcharge = 2.0;
	
	@Override
	public double calculateInterest(double principal, int timeInYears) {
		double  finalRate = rate + riskSurcharge;
		 
		
		return principal * finalRate * timeInYears / 100;
	}

}

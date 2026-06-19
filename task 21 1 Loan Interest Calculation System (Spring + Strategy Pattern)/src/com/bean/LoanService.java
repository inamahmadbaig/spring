package com.bean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interfac.InterestStrategy;
@Component
public class LoanService {
	
	Map<String, InterestStrategy> interestStrategyMap;
	@Autowired
	public void setInterestStrategyMap(Map<String, InterestStrategy> interestStrategyMap) {
		this.interestStrategyMap = interestStrategyMap;
	}

	public double calculateLoanInterest(String loanType,double principal,int time) {
		
		InterestStrategy interestStrategy = interestStrategyMap.get(loanType);
		if(interestStrategy == null) {
			throw new IllegalArgumentException("Invalid loan type: " + loanType);
		}
		return interestStrategy.calculateInterest(principal, time);
	}
}
/*	
 * 
 * this manual approach
 * 
 * public class LoanService {

    private InterestStrategy interestStrategy;

    // Setter for manual runtime switching
    public void setInterestStrategy(InterestStrategy strategy) {
        this.interestStrategy = strategy;
    }

    public double calculateLoanInterest(double principal, int time) {
        if (interestStrategy == null) {
            throw new IllegalStateException("InterestStrategy not set");
        }
        return interestStrategy.calculateInterest(principal, time);
    }
}
 * 
 * 
 */

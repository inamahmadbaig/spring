package com.AppConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bean.CarLoanInterest;
import com.bean.HomeLoanInterest;
import com.bean.LoanService;
import com.bean.PersonalLoanInterest;
import com.interfac.InterestStrategy;

@Configuration
@ComponentScan("com.bean")
public class AppConfig {
	@Bean
	public InterestStrategy  homeLoanInterest() {
		return new HomeLoanInterest();
	}
	@Bean
	public InterestStrategy  carLoanInterest() {
		return new CarLoanInterest();
	}
	@Bean
	public InterestStrategy  personalLoanInterest() {
		return new PersonalLoanInterest();
	}
	
}

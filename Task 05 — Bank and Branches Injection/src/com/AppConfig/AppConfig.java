package com.AppConfig;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbean.Bank;

@Configuration
public class AppConfig {
	@Bean
	public Bank getBank() {
		Bank bank = new Bank();
		
		bank.setBankName("Axis Bank");
		// Injecting branch data using Map.of()
		bank.setBranches(Map.of(
				
				"B001","Hyderabad",
				"B002", "Chennai",
				"B003", "Pune"				
				));
		return bank;
	}
}

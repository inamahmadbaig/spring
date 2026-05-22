package com.AppConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbean.Company;
import com.sbean.Department;

@Configuration
public class AppConfig {
	@Bean
	public Department dept1() {
		return new Department(101, "IT");
	}
	@Bean
	public Department dept2() {
		return new Department(102, "HR");
	}
	@Bean
	public Department dept3() {
		return new Department(103, "Finance");
	}
	@Bean
	public Company getCompany() {
		return new Company();
	}
}

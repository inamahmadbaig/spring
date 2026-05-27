package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name = "Ravi";
	private String role = "Backend Developer";
	
	public String getEmployee() {
		return"Employee: "+name+" ("+role+")";
	}
}

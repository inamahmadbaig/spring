package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Company {
	private String companyName="Tech Solutions";
	private Employee employee;
	private Address address;
	
	@Autowired
	public Company(Employee employee, Address address) {
		super();
		this.employee = employee;
		this.address = address;
	}
	
	public String showDetails() {
		return"Company: "+companyName+" "+employee.getEmployee()+" "+address.getAddress();
	}
	
}

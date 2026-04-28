package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;

public class School {
	private String schoolName;
	private Principal principal;
	private Address address;
	

	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}



	public void showDetails() {
		System.out.println("School: "+schoolName);
		principal.display();
		address.display();
	}
	
}

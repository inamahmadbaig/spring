package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String name="Pawan";
	private String email="pawan@gmail.com";
	
	public String getCoustomer() {
		return "Customer: "+name+" ("+email+")";
		
	}
}

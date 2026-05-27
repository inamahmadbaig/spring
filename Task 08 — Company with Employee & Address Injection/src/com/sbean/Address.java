package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city ="Bangalore";
	private String state="Karnataka";
	
	public String getAddress() {
		return "Location: "+city+","+state;
	}
}

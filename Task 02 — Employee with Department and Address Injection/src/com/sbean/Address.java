package com.sbean;

public class Address {
	private String city;
	private String country;

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void showAddress() {
		System.out.println("Address: "+city+", "+country);
	}
}

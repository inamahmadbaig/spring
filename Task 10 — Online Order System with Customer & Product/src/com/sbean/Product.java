package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private String pname="Laptop";
	private double price=7000;
	
	public String getProduct() {
		return "Product: "+pname+"("+price+")";
		
	}
}

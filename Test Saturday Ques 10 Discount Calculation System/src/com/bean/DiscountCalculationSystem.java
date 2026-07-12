package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class DiscountCalculationSystem {
	@Value("${dis.price}")
	private double price;
	@Value("${dis.discountPercent}")
	private double discountPercent;
	
	private double finalPrice; 
	
	public void discountCalculation() {
		
		finalPrice = price - (price * discountPercent / 100);
		System.out.println("price: "+price);
		System.out.println("discountPercent: "+discountPercent);
		System.out.println("finalPrice: "+finalPrice);
	}

}

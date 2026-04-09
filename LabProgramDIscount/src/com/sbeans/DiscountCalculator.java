package com.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
	private LocalDate currentDate;
	private double price;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String calculateDiscount() {
		
		DayOfWeek day = currentDate.getDayOfWeek();
		String dayName =day.toString();
		double finalPrice;
		String msg;
		 if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
	            finalPrice = price - (price * 0.20); // 20% discount
	            msg = "20% Discount applied";
	        } else {
	            finalPrice =  price - (price * 0.10); // 10% discount
	            msg =" 10% Discount applied";
	            
	        }
//		 return "Discount Price : "+ finalPrice +" ("+msg+")";
		 return "Today is " + dayName +
	               " -> Discounted Price: " + finalPrice +
	               " (" + msg + ")";
	}
}

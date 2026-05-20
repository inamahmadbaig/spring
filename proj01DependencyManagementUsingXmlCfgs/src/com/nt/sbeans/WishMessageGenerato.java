package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerato {
	private LocalTime time;
	
	public WishMessageGenerato() {
		System.out.println("WishMassageGenertor::0-param constructor");
	}
	//setter method for setter injection
	
	public void setTime(LocalTime time) {
		System.out.println("WishMassageGenertor.setTime(-)");
		this.time=time;
	}
	// Business method
	public String showWishMassage(String user) {
		System.out.println("WishMassageGenertor.showWishMassage");
		//get current hour of the day
		int hour=time.getHour();
		// generate the wish message
		
		if(hour<12) {
			return "good Moorning";
		}else if(hour<16) {
			return "Good AfterNoon";
		}else if(hour<20) {
			return "Good Evening";
		}else {
			return "Good Night::"+this;
		}
	}
}

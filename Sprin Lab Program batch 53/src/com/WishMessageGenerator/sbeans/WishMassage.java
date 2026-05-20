package com.WishMessageGenerator.sbeans;

import java.time.LocalDateTime;

public class WishMassage {
	private LocalDateTime currentDateTime;

	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	
	
	public String generateWishMessage(String user) {
		int hour = currentDateTime.getHour();
		System.out.println(currentDateTime + " ");
		String msg ;
		if(hour<12) {
			msg = "Good Mornig";
		}else if(hour<16) {
			msg = "Good AfterNoon";
		}else if(hour<20) {
			msg = "Good evning";
		}else {
			msg = "Good Night";
		}
		return msg +" "+user;
	}
}

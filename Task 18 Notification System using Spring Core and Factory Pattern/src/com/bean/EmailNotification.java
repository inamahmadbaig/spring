package com.bean;

import org.springframework.stereotype.Component;

import com.InterFace.Notification;
@Component("email")
public class EmailNotification implements Notification{

	
	@Override
	public String sendNotification(String message) {
		// TODO Auto-generated method stub
		return "Email sent: "+message;
	}

}

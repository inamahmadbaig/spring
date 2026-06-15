package com.bean;

import org.springframework.stereotype.Component;

import com.InterFace.Notification;
@Component("sms")
public class SMSNotification implements Notification {

	@Override
	public String sendNotification(String message) {
		// TODO Auto-generated method stub
		return "SMS sent: "+message;
	}

}

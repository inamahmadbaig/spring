package com.bean;

import org.springframework.stereotype.Component;

import com.InterFace.Notification;
@Component("push")
public class PushNotification implements Notification {

	@Override
	public String sendNotification(String message) {
		// TODO Auto-generated method stub
		return "Push notification sent: "+message;
	}

}

package com.bean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.InterFace.Notification;

@Component
public class NotificationFactory {
	@Autowired
	private Map<String, Notification> notificationMap;
	
	public Notification getNotification(String type) {
		  Notification notification = notificationMap.get(type.toLowerCase());
		    if (notification == null) {
		        throw new IllegalArgumentException("Invalid notification type: " + type);
		    }
		    return notification;
	}
}

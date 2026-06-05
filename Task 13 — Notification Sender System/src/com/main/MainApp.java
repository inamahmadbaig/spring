package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbean.NotificationService;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		NotificationService n = ct.getBean(NotificationService.class);
		System.out.println(n.notifyUser());
		
	}
}

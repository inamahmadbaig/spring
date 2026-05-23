package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.sbean.Restaurant;

public class RestaurantMainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Restaurant r = ct.getBean(Restaurant.class);
		r.showMenu();
		
	}
}

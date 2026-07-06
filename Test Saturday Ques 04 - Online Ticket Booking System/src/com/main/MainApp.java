package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfgs.Appli;
import com.sbean.Passenger;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(Appli.class);
		
		Passenger p = ct.getBean(Passenger.class);
		p.display();
		
	}
}

package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Vehicle;
import com.cofgs.AppConfig;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Vehicle v = ct.getBean(Vehicle.class);
		System.out.println(v.startVehicle());
		
	}
}

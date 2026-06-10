package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.target.Vehicle;
import com.target.VehicleService;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext(AppConfig.class);
		
		VehicleService vehicleService = ct.getBean(VehicleService.class);
		
		Vehicle vehicle = vehicleService.createVehicle("car", "diesel");
		System.out.println(vehicle.getDescription());
		
	}
}

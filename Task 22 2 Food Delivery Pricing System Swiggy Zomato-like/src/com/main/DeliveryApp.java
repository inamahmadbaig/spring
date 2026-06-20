package com.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfigs.AppConfig;
import com.Interface.DeliveryChargeStrategy;
import com.target.DeliveryService;

public class DeliveryApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		DeliveryService deliveryService = ct.getBean(DeliveryService.class);
/*
		deliveryService.setStrategy(ct.getBean("normalDelivery",DeliveryChargeStrategy.class));
		System.out.println("Delivery Charge is: "+deliveryService.calculateTotal(5));
		*/
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter delivery type (fastDelivery / normalDelivery / scheduledDelivery): ");
	        String type = sc.nextLine();

	        System.out.println("Enter distance: ");
	        double distance = sc.nextDouble();
	        
	        try {
	        	double result = deliveryService.calculateTotal(type, distance);
	        	 System.out.println("Total Delivery Charge: " + result);
	        	
	        }catch (Exception e) {
	        	 System.out.println("Invalid delivery type entered!");
	        	 e.printStackTrace();
			}
	        
	        sc.close();
	        ct.close();
	        
	}
}

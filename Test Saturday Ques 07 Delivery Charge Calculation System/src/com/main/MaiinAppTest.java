package com.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.DeliveryStrategies;
import com.cfgss.appCfgss;
import com.interFace.DeliveryService;

public class MaiinAppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(appCfgss.class);
		
//		DeliveryStrategies deliveryStrategies = ct.getBean(DeliveryStrategies.class);
//		deliveryStrategies.setDeliveryService(ct.getBean("expressDelivery",DeliveryService.class));
//		deliveryStrategies.displya(" customer");
		
		Scanner sc = new Scanner(System.in);
        // User input
		System.out.println("Welcome Store");
        System.out.print("Enter customer name: ");
        String customer = sc.nextLine();

        System.out.println("Choose delivery type: express / SameDayDelivery / StandardDelivery ");
        String type = sc.nextLine();

        DeliveryStrategies deliveryStrategies = ct.getBean(DeliveryStrategies.class);

        DeliveryService service = null;

        // user choice ke basis par bean select
        if (type.equalsIgnoreCase("express")) {
            service = ct.getBean("expressDelivery", DeliveryService.class);
        } 
        else if (type.equalsIgnoreCase("SameDayDelivery")) {
        	service = ct.getBean("sameDayDelivery", DeliveryService.class);
        } 
        else if (type.equalsIgnoreCase("standardDelivery")) {
        	service = ct.getBean("bb", DeliveryService.class);
        } 
        
        

        deliveryStrategies.setDeliveryService(service);
        deliveryStrategies.displya(customer);
	}
}

package com.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.InterFace.Notification;
import com.bean.NotificationFactory;
import com.cfgss.Application;

public class NotificationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(Application.class);
		
		Scanner sc = new Scanner(System.in);
		NotificationFactory factory = ct.getBean(NotificationFactory.class);
		
		try {

			System.out.println("Enter notification type:: ");
			String type = sc.nextLine();
			System.out.println("Enter message:: ");
			String msg = sc.nextLine();
			
			Notification notification = factory.getNotification(type);
			notification.sendNotification(msg);
			System.out.println(notification.sendNotification(msg));
		}catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        } finally {
            sc.close();
        }
		
		

	}
	

}

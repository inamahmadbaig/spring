package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cf.AppConfig;
import com.sbean.PaymentProcessor;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentProcessor p = ct.getBean(PaymentProcessor.class);
		System.out.println(p.processPayment(2500));
	}
}

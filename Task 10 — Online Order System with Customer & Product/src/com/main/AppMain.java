package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfgs.AppC;
import com.sbean.Order;


public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppC.class);
		Order o = ct.getBean(Order.class);
		System.out.println(o.showDetails());
		
	}
}

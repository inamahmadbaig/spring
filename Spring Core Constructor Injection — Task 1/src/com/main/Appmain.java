package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgfs.Application;
import com.sbean.Car;

public class Appmain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext n = 
				new AnnotationConfigApplicationContext(Application.class);
		Car c = n.getBean(Car.class);
		c.displayCarDetails();
	}
}

package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgfs.ApplicationCon;
import com.sbean.RideController;

public class MainAppLication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(ApplicationCon.class);
		RideController r = ct.getBean(RideController.class);
		
		System.out.println(r.bookCar(1500));
		System.out.println("-----------------");
		System.out.println(r.bookBike(1000));
		System.out.println("-----------------");
		System.out.println(r.bookAuto(500));
	}
}

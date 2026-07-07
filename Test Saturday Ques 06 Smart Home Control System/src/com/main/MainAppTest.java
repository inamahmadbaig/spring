package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfgsss.application;
import com.sbean.ControlServices;

public class MainAppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(application.class);
		
		ControlServices controlServices = ct.getBean(ControlServices.class);
		controlServices.display();
	}
}

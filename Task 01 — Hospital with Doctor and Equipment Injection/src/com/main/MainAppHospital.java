package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.confing.AppConfig;
import com.sbean.Hospital;

public class MainAppHospital {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hospital hos = ct.getBean(Hospital.class);
		hos.showDetails();
	}
}

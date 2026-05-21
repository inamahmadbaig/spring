package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.sbean_target_class.University;

public class MainAppUniverCity {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		University uni = ct.getBean(University.class);
		
		uni.showDetails();
		
	}
}

package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.sbean.College;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		College college = ct.getBean(College.class);
		System.out.println(college.showCollage());
	}
}

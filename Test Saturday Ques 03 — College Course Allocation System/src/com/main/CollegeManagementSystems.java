package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.App;
import com.sbean.Faculty;

public class CollegeManagementSystems {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(App.class);
		
		Faculty f = ct.getBean(Faculty.class);
		f.display();
		
	}
}

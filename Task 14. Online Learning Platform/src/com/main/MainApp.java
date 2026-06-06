package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.AppCf;
import com.sbean.LearningController;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppCf.class);
		
		LearningController l = ct.getBean(LearningController.class);
		
		System.out.println(l.enrollJavaCourse());
		System.out.println("----------");
		System.out.println(l.enrollPythonCourse());
		System.out.println("----------");
		System.out.println(l.enrollDataScienceCourse());
		System.out.println("----------");
		
	}
}

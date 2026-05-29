package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppCgfs.AppCgfs;
import com.sbean.Library;

public class MainLibrary {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppCgfs.class);
		
		Library l = ct.getBean(Library.class);
		System.out.println(l.showDetails());
		
	}
}

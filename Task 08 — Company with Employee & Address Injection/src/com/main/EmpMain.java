package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppCfgs.AppCfgs;
import com.sbean.Company;

public class EmpMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppCfgs.class);
		Company c = ct.getBean(Company.class);
		
		System.out.println(c.showDetails());
		
	}
}

package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.sbean.Bank;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct  =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Bank b = ct.getBean(Bank.class);
		b.showBranches();
		
	}
}

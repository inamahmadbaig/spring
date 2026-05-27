package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Hospital;
import com.cfgs.AppConfg;

public class HospitalApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfg.class);
		
		Hospital h = ct.getBean(Hospital.class);
		System.out.println(h.showDetails());
		
	}
}

package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfgs.Application;
import com.sbean.Employee;

public class MainAppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(Application.class);
		Employee emp = ct.getBean(Employee.class);
		emp.showEmployeeInfo();
	}
}

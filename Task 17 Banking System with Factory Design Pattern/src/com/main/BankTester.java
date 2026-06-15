package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.Application;
import com.target.Customer;

public class BankTester {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(Application.class);
		
		Customer customer = ct.getBean(Customer.class);
		customer.setCustomerId(101);
		customer.setCustomerName("Inam");
		customer.setBank("SBI");
		
		customer.deposit(5000);
		customer.withdraw(2000);
		customer.displayDetails();
		System.out.println("-----------------");
		Customer customer1 = ct.getBean(Customer.class);
		customer1.setCustomerId(101);
		customer1.setCustomerName("Ahmad");
		customer1.setBank("HDFC");
		
		customer1.deposit(5000);
		customer1.withdraw(5000);
		customer1.displayDetails();
		
	}
}

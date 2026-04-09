package com.main;

import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sbeans.DiscountCalculator;

public class DiscountCalculatorMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext fl = 
				new FileSystemXmlApplicationContext("src/com/cfgs/application.xml");
		DiscountCalculator generator = fl.getBean("ds",DiscountCalculator.class);
//		double msg = generator.calculateDiscount();
		// Take input from user

		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		  // Inject value manually
		generator.setPrice(price);
		// Call method
        System.out.println(generator.calculateDiscount());
//		System.out.println("Discount Price is "+msg);
	}
}

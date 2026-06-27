package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Interface.ShippingCostStrategy;

import com.bean.ShippingCostContext;
import com.cfgss.Appcon;

public class ShippingAppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(Appcon.class);
		
		ShippingCostContext costContext = ct.getBean(ShippingCostContext.class);
		costContext.setShippingCostStrategy(ct.getBean("standardShipping",ShippingCostStrategy.class));
		IO.println("Shipping Charge is: "+costContext.calculate(5, 5));
		System.out.println("--------------");
		costContext.setShippingCostStrategy(ct.getBean("expressShipping",ShippingCostStrategy.class));
		IO.println("Shipping Charge is: "+costContext.calculate(5, 5));
		
		System.out.println("--------------");
		costContext.setShippingCostStrategy(ct.getBean("overnightShipping",ShippingCostStrategy.class));
		IO.println("Shipping Charge is: "+costContext.calculate(5, 5));

	}
}

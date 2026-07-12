package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.DiscountCalculationSystem;
import com.cfgs.AppCfgs;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppCfgs.class);
		DiscountCalculationSystem calculationSystem = ct.getBean(DiscountCalculationSystem.class);
		calculationSystem.discountCalculation();
	}
}

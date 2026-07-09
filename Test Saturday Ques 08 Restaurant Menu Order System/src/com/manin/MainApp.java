package com.manin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.FoodFactory;
import com.cfgsa.Cfgs;
import com.interFace.Foodorder;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(Cfgs.class);
		FoodFactory factory = ct.getBean(FoodFactory.class);
		
		IO.println("enter food what you eat -> Pizza / Burger / Biryani ect...");
		String foodName = IO.readln("enter: ");
		Foodorder food = factory.grtFood(foodName);
		food.foodOrder();
	}
}

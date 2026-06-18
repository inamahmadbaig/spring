package com.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Interface.Food;
import com.appCgfs.Config;
import com.sbean.FoodFactory;

public class FoodDeliverySystemApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(Config.class);
		Scanner sc = new Scanner(System.in);
		FoodFactory factory = ct.getBean(FoodFactory.class);
		System.out.println("Enter food type: ");
		String foodType = sc.nextLine();
		
		Food food = factory.getFood(foodType);
		System.out.println(food.prepareFood());
	}
}

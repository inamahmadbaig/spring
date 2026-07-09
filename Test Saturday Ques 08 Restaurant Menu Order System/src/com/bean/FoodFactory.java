package com.bean;

import org.springframework.stereotype.Component;

import com.interFace.Foodorder;
@Component
public class FoodFactory {
	
	
	public Foodorder grtFood(String type) {
		
		 if (type == null) {
	            return null;
	        }
		if(type.equalsIgnoreCase("Pizza")) {
			return new Pizza();
		}else if(type.equalsIgnoreCase("Burger")) {
			return new Burger();
		}else if(type.equalsIgnoreCase("Biryani")) {
			return new Biryani();
		}
		throw new IllegalArgumentException("Invalid food type: " + type);
	}
}

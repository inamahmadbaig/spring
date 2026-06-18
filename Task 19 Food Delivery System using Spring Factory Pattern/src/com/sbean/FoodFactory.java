package com.sbean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Interface.Food;

@Component
public class FoodFactory {
	@Autowired
	private Map<String, Food> foodMap;
	
	public Food getFood(String type) {
		Food food = foodMap.get(type);
		
		if(food==null) {
			 throw new IllegalArgumentException("Invalid food type: " + type);
		}
		return food;
	}

}

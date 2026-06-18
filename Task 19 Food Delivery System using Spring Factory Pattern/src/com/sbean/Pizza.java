package com.sbean;

import org.springframework.stereotype.Component;

import com.Interface.Food;
@Component("pizza")
public class Pizza implements Food {
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Preparing Pizza...";
	}

}

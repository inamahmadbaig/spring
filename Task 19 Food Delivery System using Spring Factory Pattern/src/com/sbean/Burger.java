package com.sbean;

import org.springframework.stereotype.Component;

import com.Interface.Food;
@Component("burger")
public class Burger implements Food {

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Preparing Burger...";
	}

}

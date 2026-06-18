package com.sbean;

import org.springframework.stereotype.Component;

import com.Interface.Food;
@Component("biryani")
public class Biryani implements Food {

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Preparing Biryani...";
	}

}

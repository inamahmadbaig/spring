package com.bean;

import com.interFace.Foodorder;

public class Burger implements Foodorder {

	int price = 150;
	@Override
	public void foodOrder() {
		// TODO Auto-generated method stub
		System.out.println("Please wait.. Preparing Burger and Price is "+price+" $"); 
	}

}

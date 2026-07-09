package com.bean;

import com.interFace.Foodorder;

public class Pizza implements Foodorder {

	int price = 250;
	@Override
	public void foodOrder() {
		// TODO Auto-generated method stub
		System.out.println("Please wait..Preparing pizza and Price is "+price+" $"); 
	}

}

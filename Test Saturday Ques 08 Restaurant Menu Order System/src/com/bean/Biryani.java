package com.bean;

import com.interFace.Foodorder;

public class Biryani implements Foodorder {

	int price = 300;
	@Override
	public void foodOrder() {
		// TODO Auto-generated method stub
		System.out.println("Please wait.. Preparing Biryani is ready to few minutes and Price is "+price+" $") ;
	}

}

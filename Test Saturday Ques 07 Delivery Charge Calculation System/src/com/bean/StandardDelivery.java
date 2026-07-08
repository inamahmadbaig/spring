package com.bean;

import org.springframework.stereotype.Component;

import com.interFace.DeliveryService;
@Component("bb")
public class StandardDelivery implements DeliveryService{

	@Override
	public String DeliveryCharges(String type) {
		// TODO Auto-generated method stub
		return ""+type+" - Standard Delivery — ₹50 charge";
	}

}

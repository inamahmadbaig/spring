package com.bean;

import org.springframework.stereotype.Component;

import com.interFace.DeliveryService;
@Component
public class ExpressDelivery implements DeliveryService{

	@Override
	public String DeliveryCharges(String type) {
		// TODO Auto-generated method stub
		return ""+type+" - Express Delivery — ₹100 charge";
	}

}

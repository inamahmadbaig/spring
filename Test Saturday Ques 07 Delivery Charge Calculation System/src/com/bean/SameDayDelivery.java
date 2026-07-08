package com.bean;

import org.springframework.stereotype.Component;

import com.interFace.DeliveryService;
@Component
public class SameDayDelivery implements DeliveryService {

	@Override
	public String DeliveryCharges(String type) {
		// TODO Auto-generated method stub
		return ""+type+" - Same-Day Delivery — ₹200 charge"+type;
	}

}

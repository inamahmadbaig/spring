package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interFace.DeliveryService;

@Component
public class DeliveryStrategies {
	
	DeliveryService deliveryService;
	
	

	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}



	public void displya(String type) {
		System.out.println(deliveryService.DeliveryCharges(type));
	}
}

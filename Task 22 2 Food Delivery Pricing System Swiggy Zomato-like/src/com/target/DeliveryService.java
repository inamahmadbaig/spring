package com.target;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Interface.DeliveryChargeStrategy;
@Component
public class DeliveryService {
/*
	DeliveryChargeStrategy strategy;
	
	public void setStrategy(DeliveryChargeStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double calculateTotal(double distance) {
		return strategy.calculateCharge(distance);
	}
	*/
	
	Map<String, DeliveryChargeStrategy> deliveryMap;
	@Autowired
	public void setDeliveryMap(Map<String, DeliveryChargeStrategy> deliveryMap) {
		this.deliveryMap = deliveryMap;
	}
	
	public double calculateTotal(String deliveryType,double distance) {
		DeliveryChargeStrategy deliveryChargeStrategy = deliveryMap.get(deliveryType);
		
		return deliveryChargeStrategy.calculateCharge(distance);
		
	}
	
	
}

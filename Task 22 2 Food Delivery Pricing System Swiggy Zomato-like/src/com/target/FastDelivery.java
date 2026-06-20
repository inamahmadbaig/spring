package com.target;

import com.Interface.DeliveryChargeStrategy;

public class FastDelivery implements DeliveryChargeStrategy {

	double baseCharge = 50;
	double perKm = 10;

	
	public double calculateCharge(double distance) {
		double calculatePerKm = perKm* distance;
		
		return baseCharge + calculatePerKm;
		
	}

	

}

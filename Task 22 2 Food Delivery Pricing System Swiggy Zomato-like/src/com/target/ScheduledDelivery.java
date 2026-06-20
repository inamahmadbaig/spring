package com.target;

import com.Interface.DeliveryChargeStrategy;

public class ScheduledDelivery implements DeliveryChargeStrategy{
	
	double baseCharge = 20;
	double perKm = 4;
	@Override
	public double calculateCharge(double distance) {

		double calculatePerKm = perKm * distance;
		
		return baseCharge + calculatePerKm;
	}
}

package com.target;

import com.Interface.DeliveryChargeStrategy;

public class NormalDelivery implements DeliveryChargeStrategy{

	double baseCharge = 30;
	double perKm = 5;

	@Override
	public double calculateCharge(double distance) {
		double calculatePerKm = perKm * distance;
		return baseCharge + calculatePerKm;
	}

}

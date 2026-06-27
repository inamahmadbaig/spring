package com.bean;

import com.Interface.ShippingCostStrategy;

public final class StandardShipping implements ShippingCostStrategy {
	final double weightCharges=5;
	final double distanceCharges=0.05;
	
	@Override
	public double calculateShippingCost(double weight, double distance) {
		double finalWeightCharges = weightCharges * weight;
		double finalDistanceCharges = distanceCharges * distance;
		return finalWeightCharges + finalDistanceCharges;
	}

}

package com.bean;


import com.Interface.ShippingCostStrategy;

public final class ExpressShipping implements ShippingCostStrategy {
	final double weightCharges=10;
	final double distanceCharges=1;
	
	@Override
	public double calculateShippingCost(double weight, double distance) {
		double finalWeightCharges = weightCharges * weight;
		double finalDistanceCharges = distanceCharges * distance;
		IO.println("Express shipping provides faster delivery, which results in a higher cost compared to standard shipping.");
		return finalWeightCharges + finalDistanceCharges;
	}

}


package com.bean;



import com.Interface.ShippingCostStrategy;

public final class OvernightShipping implements ShippingCostStrategy {
	final double weightCharges=20;
	final double distanceCharges=2;
	
	@Override
	public double calculateShippingCost(double weight, double distance) {
		double finalWeightCharges = weightCharges * weight;
		double finalDistanceCharges = distanceCharges * distance;
		System.out.println("A premium service for overnight delivery, the most expensive shipping option.");
		return finalWeightCharges + finalDistanceCharges;
	}

}



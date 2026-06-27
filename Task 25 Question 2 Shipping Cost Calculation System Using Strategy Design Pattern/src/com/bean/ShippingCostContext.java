package com.bean;

import org.springframework.stereotype.Component;

import com.Interface.ShippingCostStrategy;

@Component
public final class ShippingCostContext {
	private ShippingCostStrategy shippingCostStrategy;
	
	public void setShippingCostStrategy(ShippingCostStrategy shippingCostStrategy) {
		this.shippingCostStrategy = shippingCostStrategy;
	}
	
	public double calculate(double weight,double distance) {
		return shippingCostStrategy.calculateShippingCost(weight, distance);
	}
}

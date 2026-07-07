package com.bean;


import com.Interface.OttSubscription;

public final class AmazonPrime implements OttSubscription {

	@Override
	public String subscription(String planType) {
		return " Amazon Prime subscription activated with " + planType + " plan ";
	}
}

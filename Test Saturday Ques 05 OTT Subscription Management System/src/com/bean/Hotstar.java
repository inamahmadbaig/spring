package com.bean;


import com.Interface.OttSubscription;

public final class Hotstar implements OttSubscription {

	@Override
	public String subscription(String planType) {
		return " Hotstar subscription activated with " + planType + " plan ";
	}
}

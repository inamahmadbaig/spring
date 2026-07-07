package com.bean;

import com.Interface.OttSubscription;

public final class Netflix implements OttSubscription {

	@Override
	public String subscription(String planType) {
		return "Netflix subscription activated with " + planType + " plan ";
	}
}

package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class OnlineDelivery implements DeliveryMode {

	@Override
	public String deliver(String courseName) {
		return "Live Online";
	}

}

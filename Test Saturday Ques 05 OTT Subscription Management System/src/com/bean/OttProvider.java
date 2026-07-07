package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Interface.OttSubscription;

@Component
public final class OttProvider {
	@Autowired
	@Qualifier("amazonPrime")
	private OttSubscription ottSubscription;
	
	public void display(String planeType) {
		System.out.println(ottSubscription.subscription(planeType));
	}
}

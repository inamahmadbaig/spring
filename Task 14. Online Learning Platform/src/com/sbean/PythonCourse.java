package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PythonCourse implements Course{
	
	
	private DeliveryMode deliveryMode;

	@Autowired
	public PythonCourse(@Qualifier("recordedDelivery")DeliveryMode deliveryMode) {
		super();
		this.deliveryMode = deliveryMode;
	}

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return "Python for Beginners";
	}

	public DeliveryMode getDeliveryMode() {
		return deliveryMode;
		
	}
}

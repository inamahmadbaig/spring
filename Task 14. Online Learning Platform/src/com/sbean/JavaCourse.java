package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class JavaCourse implements Course {

	
	private DeliveryMode deliveryMode;

	@Autowired
	public JavaCourse(@Qualifier("onlineDelivery")DeliveryMode deliveryMode) {
		super();
		this.deliveryMode = deliveryMode;
	}

	@Override
	public String getCourseName() {
		return "Java Programming";
	}

	public DeliveryMode getDeliveryMode() {
		return deliveryMode;
		
	}
}

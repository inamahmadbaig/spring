package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class ClassroomDelivery implements DeliveryMode {

	@Override
	public String deliver(String courseName) {
		// TODO Auto-generated method stub
		return "In-Person Classroom";
	}

}

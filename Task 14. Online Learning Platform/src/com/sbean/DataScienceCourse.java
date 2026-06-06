package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class DataScienceCourse implements Course {

	
	
	private DeliveryMode deliveryMode;
	@Autowired
	public DataScienceCourse(@Qualifier("classroomDelivery")DeliveryMode deliveryMode) {
		super();
		this.deliveryMode = deliveryMode;
	}
	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return "Data Science with ML";
	}
	public DeliveryMode getDeliveryMode() {
		return deliveryMode;
		
	}
}

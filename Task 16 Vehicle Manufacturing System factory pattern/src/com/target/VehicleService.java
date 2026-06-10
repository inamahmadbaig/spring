package com.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class VehicleService {
	@Autowired
	VehicleFactory factory;
	
	public Vehicle createVehicle(String type , String engineType) {
		return factory.createVehicle(type, engineType);
	}
}

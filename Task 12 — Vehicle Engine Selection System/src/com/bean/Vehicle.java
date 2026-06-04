package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	
	private Engine engine;
	
	@Autowired
	public Vehicle(@Qualifier("electricEngine")Engine engine) {
		super();
		this.engine = engine;
	}


	public String startVehicle() {
		 engine.start();
		 return ""; 
		
	}
	
}

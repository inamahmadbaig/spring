package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RideController {
	@Autowired
	private Car car;
	@Autowired
	private Bike bike;
	@Autowired
	private Auto auto;
	
	public String bookCar(double amount) {
		return ""+car.ride()+" "+car.getPay().pay(amount);
		
	}
	public String bookBike(double amount) {
		return ""+bike.ride()+" "+bike.getPay().pay(amount);
		
	}
	public String bookAuto(double amount) {
		return ""+auto.ride()+" "+auto.getPay().pay(amount);
		
	}

	
}

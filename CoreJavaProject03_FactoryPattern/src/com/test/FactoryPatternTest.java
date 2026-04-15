package com.test;

import com.comps.Bike;
import com.factory.BikeFactory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		Bike bike = BikeFactory.orderBike("Standard");
		bike.dirve();
		System.out.println("============");
		Bike bike1 = BikeFactory.orderBike("sport");
		bike1.dirve();
		System.out.println("============");
		Bike bike2 = BikeFactory.orderBike("electric");
		bike2.dirve();
		System.out.println("============");
		Bike bike3 = BikeFactory.orderBike("bullet");
		bike3.dirve();
		
	}
}

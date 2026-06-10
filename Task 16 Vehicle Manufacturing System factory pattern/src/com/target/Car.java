package com.target;

public class Car implements Vehicle {
	
	Engine engine;
	int doors;
	
	
	public Car(Engine engine, int doors) {
		super();
		this.engine = engine;
		this.doors = doors;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Car Has a "+engine.getEngineType()+" Doors "+doors;

	}

	

}

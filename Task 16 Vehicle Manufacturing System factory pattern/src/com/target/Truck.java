package com.target;


public class Truck implements Vehicle {

	Engine engine;
	int payloadCapacity;
	
	
	public Truck(Engine engine, int payloadCapacity) {
		super();
		this.engine = engine;
		this.payloadCapacity = payloadCapacity;
	}


	public String getDescription() {
		return "Truck has a "+engine.getEngineType()+" payload capacity "+payloadCapacity;
	}

}

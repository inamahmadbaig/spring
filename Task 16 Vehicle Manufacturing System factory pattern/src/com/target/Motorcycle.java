package com.target;

public class Motorcycle implements Vehicle {
	Engine engine;
	boolean sidecar;
	
	
	
	public Motorcycle(Engine engine, boolean sidecar) {
		super();
		this.engine = engine;
		this.sidecar = sidecar;
	}



	public String getDescription() {
		// TODO Auto-generated method stub
		return "MoterCycle engine is "+engine.getEngineType()+" sidecar "+sidecar;
	}

}

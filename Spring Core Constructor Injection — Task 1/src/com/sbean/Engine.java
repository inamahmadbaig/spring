package com.sbean;


public class Engine {
	private String engineType;
	
	
	
	public Engine(String engineType) {
		super();
		this.engineType = engineType;
	}



	public String showEngineType() {
		return engineType;
	}



	@Override
	public String toString() {
		return  engineType +" Engine";
	}
	
}

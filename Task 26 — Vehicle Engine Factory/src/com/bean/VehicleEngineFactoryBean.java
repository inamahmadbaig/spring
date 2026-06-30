package com.bean;

import org.springframework.stereotype.Component;

import com.interfac.Engine;
@Component
public class VehicleEngineFactoryBean {

	public Engine engineFactory(String engineType) {
		System.out.println("VehicleEngineFactoryBean.engineFactory()");
		Engine engine=null;
		System.out.println("VehicleEngineFactoryBean");
		if(engineType.equalsIgnoreCase("electricEngine")) {
			engine = new ElectricEngine();
		}
		else if(engineType.equalsIgnoreCase("dieselEngine")) {
			engine = new DieselEngine();
		}else if(engineType.equalsIgnoreCase("HybridEngine")) {
			engine = new HybridEngine();
		}else {
			throw new IllegalArgumentException("Invalid engine type: " + engineType);
		}
		return engine;
		
	}
}

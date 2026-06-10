package com.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConcreteVehicleFactory implements VehicleFactory {

	@Autowired
	@Qualifier("electric")
	Engine electricEngine;

	@Autowired
	@Qualifier("diesel")
	Engine dieselEngine;

	@Override
	public Vehicle createVehicle(String type, String engineType) {

		Engine engine = engineType.equalsIgnoreCase("electric") ? electricEngine : dieselEngine;

		if (type.equalsIgnoreCase("car")) {
			return new Car(engine, 4);
		} else if (type.equalsIgnoreCase("truck")) {
			return new Truck(engine, 100);
		} else if (type.equalsIgnoreCase("motorcycle")) {
			return new Motorcycle(engine, true);
		} else {
			throw new IllegalArgumentException("Ivalid Input");
		}

	}

}


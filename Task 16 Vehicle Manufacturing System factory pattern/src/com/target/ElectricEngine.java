package com.target;

import org.springframework.stereotype.Component;
@Component("electric")
public class ElectricEngine  implements Engine{

	@Override
	public String getEngineType() {
		return "Electric Engine";
	}

}

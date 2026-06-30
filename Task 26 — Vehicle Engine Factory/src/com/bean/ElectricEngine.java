package com.bean;

import org.springframework.stereotype.Component;

import com.interfac.Engine;
@Component
public class ElectricEngine implements Engine {

	@Override
	public void start() {
		System.out.println("ElectricEngine started using battery power");
	}

	@Override
	public void stop() {
		System.out.println("ElectricEngine stop");
	}

}

package com.bean;

import org.springframework.stereotype.Component;

import com.interfac.Engine;
@Component
public class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("DieselEngine started using Diesel ");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine stop");
	}

}

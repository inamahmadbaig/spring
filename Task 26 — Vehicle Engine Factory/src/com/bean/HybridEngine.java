package com.bean;

import org.springframework.stereotype.Component;

import com.interfac.Engine;
@Component
public class HybridEngine implements Engine {

	@Override
	public void start() {
		System.out.println("HybridEngine started  ");
	}

	@Override
	public void stop() {
		System.out.println("HybridEngine stop");
	}

}

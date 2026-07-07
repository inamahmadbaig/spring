package com.sbean;

import org.springframework.stereotype.Component;

import com.interFace.Device;
@Component
public class SmartFan implements Device {

	public String services() {
		// TODO Auto-generated method stub
		return "Smart Fan started ";
	}

}

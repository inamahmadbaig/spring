package com.sbean;

import org.springframework.stereotype.Component;

import com.interFace.Device;
@Component
public class SmartLight implements Device{

	public String services() {
		// TODO Auto-generated method stub
		return "Smart light turned on";
	}
	
}

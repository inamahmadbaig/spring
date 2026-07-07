package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interFace.Device;
@Component
public class ControlServices {
	@Autowired
	Device device;
	
	public void display() {
		System.out.println(device.services());
	}
	
}

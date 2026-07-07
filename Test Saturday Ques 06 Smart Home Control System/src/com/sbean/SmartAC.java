package com.sbean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.interFace.Device;
@Component
@Primary
public class SmartAC implements Device{

	@Override
	public String services() {
		// TODO Auto-generated method stub
		return "Smart AC started now enjoy..";
	}

}

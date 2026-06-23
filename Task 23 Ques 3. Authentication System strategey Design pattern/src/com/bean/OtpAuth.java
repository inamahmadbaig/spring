package com.bean;

import com.interfaces.AuthStrategy;

public class OtpAuth implements AuthStrategy{
	String phoneNumber;
	String otp;
	
	public OtpAuth(String phoneNumber, String otp) {
		super();
		this.phoneNumber = phoneNumber;
		this.otp = otp;
	}

	@Override
	public boolean authenticate(String input1, String input2) {
		
		return phoneNumber.equals(input1) && otp.equals(input2);
	}
}

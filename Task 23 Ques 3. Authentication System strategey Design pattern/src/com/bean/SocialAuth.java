package com.bean;

import com.interfaces.AuthStrategy;

public class SocialAuth implements AuthStrategy{
	String providerName;
	String token;
	
	public SocialAuth(String providerName, String token) {
		super();
		this.providerName = providerName;
		this.token = token;
	}

	@Override
	public boolean authenticate(String input1, String input2) {
		// TODO Auto-generated method stub
		return providerName.equals(input1) && token.equals(input2);
	}
}

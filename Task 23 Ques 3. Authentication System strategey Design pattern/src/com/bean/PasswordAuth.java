package com.bean;

import com.interfaces.AuthStrategy;

public class PasswordAuth implements AuthStrategy {

	String userName;
	String password;
	
	public PasswordAuth(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public boolean authenticate(String input1, String input2) {
		// TODO Auto-generated method stub
		return userName.equals(input1) && password.equals(input2);
	}

}

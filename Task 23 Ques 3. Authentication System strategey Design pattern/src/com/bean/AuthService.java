package com.bean;

import org.springframework.stereotype.Component;

import com.interfaces.AuthStrategy;
@Component
public class AuthService {
	AuthStrategy authStrategy;

	public void setAuthStrategy(AuthStrategy authStrategy) {
		this.authStrategy = authStrategy;
	}
	public boolean login(String input1, String input2) {
		authStrategy.authenticate(input1, input2);
		return true;
		
	}
}

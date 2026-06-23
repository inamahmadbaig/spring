package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.appCgfs.AppConfig;
import com.bean.AuthService;
import com.bean.OtpAuth;
import com.bean.PasswordAuth;
import com.bean.SocialAuth;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AuthService a = ct.getBean(AuthService.class);
		//password
		a.setAuthStrategy(new PasswordAuth("inam", "1234"));
		System.out.println(a.login("inam", "1234"));
		//otp
		a.setAuthStrategy(new OtpAuth("851601", "5555"));
		System.out.println(a.login("851601", "5555"));
		
		//social 
		a.setAuthStrategy(new SocialAuth("google", "xyz"));
		System.out.println(a.login("google", "xyd"));
	}
}

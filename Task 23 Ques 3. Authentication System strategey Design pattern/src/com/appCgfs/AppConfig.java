package com.appCgfs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bean.OtpAuth;
import com.bean.PasswordAuth;
import com.bean.SocialAuth;
import com.interfaces.AuthStrategy;

@Configuration
@ComponentScan(basePackages = "com.bean")
public class AppConfig {
	@Bean
	public AuthStrategy password() {
		return new PasswordAuth("inam", "1234");
	}
	@Bean
	public AuthStrategy otpAu() {
		return new OtpAuth("851601", "5555");
	}
	@Bean
	public AuthStrategy social() {
		return new SocialAuth("google", "xyd");
	}
}

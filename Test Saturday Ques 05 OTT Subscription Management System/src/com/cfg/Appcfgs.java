package com.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Interface.OttSubscription;
import com.bean.AmazonPrime;
import com.bean.Hotstar;
import com.bean.Netflix;

@Configuration
@ComponentScan(basePackages = "com.bean")
public class Appcfgs {
	@Bean(name = "hotstar")
	public OttSubscription get1() {
		return new Hotstar();
	}
	@Bean(name = "netflix")
	public OttSubscription get2() {
		return new Netflix();
	}
	@Bean(name = "amazonPrime")
	public OttSubscription get3() {
		return new AmazonPrime();
	}
}

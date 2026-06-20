package com.AppConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Interface.DeliveryChargeStrategy;
import com.target.FastDelivery;
import com.target.NormalDelivery;
import com.target.ScheduledDelivery;

@Configuration
@ComponentScan(basePackages = "com.target")
public class AppConfig {
	@Bean
	public DeliveryChargeStrategy normalDelivery() {
		return new NormalDelivery();
	}
	@Bean
	public DeliveryChargeStrategy fastDelivery() {
		return new FastDelivery();
	}
	@Bean
	public DeliveryChargeStrategy scheduledDelivery() {
		return new ScheduledDelivery();
	}
}

package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbean.MenuItem;
import com.sbean.Restaurant;

@Configuration
public class AppConfig {
	@Bean
	public MenuItem getItem1() {
		return new MenuItem(101, "Pizza", 250);
	}
	@Bean
	public MenuItem getItem2() {
		return new MenuItem(102, "Burger", 250);
	}
	@Bean
	public MenuItem getItem3() {
		return new MenuItem(103, "Pasta", 250);
	}
	@Bean
	public Restaurant getRestaurant() {
		Restaurant r= new Restaurant();
		r.setRestaurantName("SpiceHub");
		return r;
	}
}

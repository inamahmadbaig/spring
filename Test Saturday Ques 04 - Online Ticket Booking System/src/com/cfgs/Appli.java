package com.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sbean.Passenger;
import com.sbean.Ticket;

@Configuration
@ComponentScan(basePackages = "com.sbean")
public class Appli {
	@Bean
	public Ticket ticket() {
		Ticket t = new Ticket(1234, "Online", "Hydrabad");
		return t;
	}
	@Bean
	public Passenger passenger() {
		Passenger p = new Passenger(121, "Inam Ahmad", ticket());
		return p;
	}
}

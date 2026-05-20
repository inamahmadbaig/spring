package com.cgfs;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sbean.Engine;

@Configuration
@ComponentScan(basePackages = "com.sbean")
public class Application {
	@Bean
	public Engine getEngin() {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter engine type: ");
		String type = sc.nextLine();
		return new Engine(type);
		
	}
	 
}
/*@Configuration → defines beans manually
@Bean → creates objects
Spring → resolves dependencies automatically by type
*/
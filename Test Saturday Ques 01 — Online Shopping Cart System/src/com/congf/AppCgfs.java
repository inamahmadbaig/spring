package com.congf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sbean.Cart;
import com.sbean.Product;

@Configuration
@ComponentScan(basePackages = "com.sbean")
public class AppCgfs {
	@Bean
	public Product getProduct() {
		Product p = new Product();
		p.setName("Laptop");
		p.setPrice(45780);
		p.setProductId(101);
		return p;
		
	}
	@Bean
	public Cart getCart() {
		Cart c = new Cart();
		
		c.setCartId(1);
		c.setUserName("Inam Ahmad");
		return c;
	}
}

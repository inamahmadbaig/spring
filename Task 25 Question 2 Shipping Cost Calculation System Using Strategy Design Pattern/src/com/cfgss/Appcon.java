package com.cfgss;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Interface.ShippingCostStrategy;
import com.bean.ExpressShipping;
import com.bean.OvernightShipping;
import com.bean.StandardShipping;

@Configuration
@ComponentScan(basePackages = "com.bean")
public class Appcon {

    @Bean
    public ShippingCostStrategy standardShipping() {
        return new StandardShipping();
    }

    @Bean
    public ShippingCostStrategy expressShipping() {
        return new ExpressShipping();
    }

    @Bean
    public ShippingCostStrategy overnightShipping() {
        return new OvernightShipping();
    }
}
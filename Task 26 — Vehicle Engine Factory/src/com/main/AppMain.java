package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.VehicleEngineFactoryBean;
import com.cfgs.AppCfgs;
import com.interfac.Engine;

public class AppMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppCfgs.class);
		VehicleEngineFactoryBean engineFactoryBean = ct.getBean(VehicleEngineFactoryBean.class);
		Engine engine  = engineFactoryBean.engineFactory("HybridEngine");
		System.out.println();
		engine.start();
		engine.stop();
		
	
	}

}

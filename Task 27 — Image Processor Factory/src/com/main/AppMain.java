package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Interfac.ImageProcessor;
import com.bean.ImageProcessorFactoryBean;
import com.cfgs.AppCfgg;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct  =
				new AnnotationConfigApplicationContext(AppCfgg.class);
		ImageProcessorFactoryBean factoryBean = ct.getBean(ImageProcessorFactoryBean.class);
		ImageProcessor imageProcessor = factoryBean.imageFactory("WatermarkProcessor");
		imageProcessor.process();
	}
}

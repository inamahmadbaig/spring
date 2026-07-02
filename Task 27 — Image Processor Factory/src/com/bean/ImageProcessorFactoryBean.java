package com.bean;

import org.springframework.stereotype.Component;

import com.Interfac.ImageProcessor;
@Component
public class ImageProcessorFactoryBean {
	public ImageProcessor imageFactory(String imageType) {
		ImageProcessor imageProcessor=null;
		if(imageType.equalsIgnoreCase("ResizeProcessor")) {
			imageProcessor = new ResizeProcessor();
		}else if(imageType.equalsIgnoreCase("FilterProcessor")) {
			imageProcessor = new FilterProcessor();
		}else if(imageType.equalsIgnoreCase("WatermarkProcessor")) {
			imageProcessor = new WatermarkProcessor();
		}else {
			throw new IllegalArgumentException("invalied...");
		}
		return imageProcessor;
	}
}

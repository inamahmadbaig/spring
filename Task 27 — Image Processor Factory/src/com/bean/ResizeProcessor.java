package com.bean;

import com.Interfac.ImageProcessor;

public class ResizeProcessor implements ImageProcessor{

	@Override
	public void process() {
		System.out.println("Image resized successfully!");
	}

}

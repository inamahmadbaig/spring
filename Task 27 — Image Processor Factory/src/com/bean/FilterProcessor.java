package com.bean;

import com.Interfac.ImageProcessor;

public class FilterProcessor implements ImageProcessor {

	@Override
	public void process() {
		System.out.println("image Filter Processor sucessfull...");
	}

}

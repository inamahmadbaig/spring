package com.sbeans;

public class YearService {
	
	public String getMonth() {
		return java.time.LocalDate.now().getMonth().toString();
	}
}

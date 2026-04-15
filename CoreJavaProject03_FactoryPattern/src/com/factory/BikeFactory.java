package com.factory;

import com.comps.Bike;
import com.comps.BulletBike;
import com.comps.EletricBike;
import com.comps.SportBike;
import com.comps.StandarBike;

public class BikeFactory {
	public static Bike orderBike(String type) {
		Bike bike = null;
		if(type.equalsIgnoreCase("Standard"))
			bike = new StandarBike();
		else if(type.equalsIgnoreCase("sport"))
			bike = new SportBike();
		else if(type.equalsIgnoreCase("electric"))
			bike = new EletricBike();
		else if(type.equalsIgnoreCase("bullet"))
			bike = new BulletBike();
		else 
			throw new IllegalArgumentException("Invaild Bike Type");
			
		return bike;
		
	}
}

package com.sbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {

	private String restaurantName;

    private List<MenuItem> menuItems;

    
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
    @Autowired
	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
    
    public void showMenu() {
    	System.out.println("Restaurant: "+restaurantName);
    	System.out.println("Menu:");
    	for(MenuItem menu: menuItems) {
    		menu.showItem();
    	}
    }

}

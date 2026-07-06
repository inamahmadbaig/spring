package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Passenger {
	private int passengerId;
	private String pName;
	private Ticket ticket;
	@Autowired
	public Passenger(int passengerId, String pName, Ticket ticket) {
		super();
		this.passengerId = passengerId;
		this.pName = pName;
		this.ticket = ticket;
	}
	
	public void display() {
		System.out.println("Enter Passenger id: "+passengerId);
		System.out.println("Enter Passenger Name: "+pName);
		ticket.getTicket();
	}
}

package com.sbean;

public class Ticket {
	private int ticketId;
	private String source;
	private String destination;
	public Ticket(int ticketId, String source, String destination) {
		super();
		this.ticketId = ticketId;
		this.source = source;
		this.destination = destination;
	}
	
	public void getTicket() {
		System.out.println("ticket Id: "+ticketId);
		System.out.println("ticket source: "+source);
		System.out.println("traval destination: "+destination);
	}
}

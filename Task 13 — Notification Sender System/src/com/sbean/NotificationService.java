package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NotificationService {
	private MessageService messageService;

	@Autowired
	public NotificationService(@Qualifier("whatsAppService")MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	public String notifyUser() {
		messageService.send("- Today Meeting at 4 PM");
		return "";
		
	}
}

package com.acme.acmetrade.services;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveWelcomeMessage() {
		
		return "How are you Doing?";
	}
}

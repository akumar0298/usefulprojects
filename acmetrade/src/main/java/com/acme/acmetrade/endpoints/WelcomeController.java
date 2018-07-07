package com.acme.acmetrade.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.acmetrade.services.WelcomeService;

@RestController
public class WelcomeController {
	@Autowired
	WelcomeService ws;
	
	@RequestMapping("/welcome")
	public String welcomeMessage() {
		return ws.retrieveWelcomeMessage();
	}

}

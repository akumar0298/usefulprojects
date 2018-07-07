package com.roi.sample.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {
	
	//@Autowired
	//WelcomeService ws;

	@RequestMapping("/welcome")
	public String welcome() {
		return "Hello,how are you doing?";
				//ws.retrieveWelcomeMessage();
	}
	
	@RequestMapping(value="/welcome/{welcomeId}", method = RequestMethod.GET)
	  public String welcomeDetails(@PathVariable ("welcomeId") int welcomeId){
	    return "The value of Welcome Id is -->" + welcomeId;
	    
	  }
	@RequestMapping(value="/cars/{carId}", method = RequestMethod.GET)
	  public String extractParameters(@PathVariable ("carId") int carId,
			           @RequestParam("fields") String fieldValue){
	    return "The value of car Id is -->" + carId + "Value is " + fieldValue;
	    
	  }
	@RequestMapping(value="/order", method = RequestMethod.POST)
	  public String extractOrder(@RequestBody MarketOrder order){
	    return "The market order content is -->" + order.toString();
	    
	  }
	

}

@Component
class WelcomeService{

	public String retrieveWelcomeMessage() {
		// TODO Auto-generated method stub
		return "How are you Doing?";
	}

}

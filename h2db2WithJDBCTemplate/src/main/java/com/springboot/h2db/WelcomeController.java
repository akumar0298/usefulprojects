package com.springboot.h2db;

import com.springboot.h2db.domain.User;
import com.springboot.h2db.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	UserRepository repo;

	
	
	@RequestMapping("/user/{userId}")
	public User welcomeUser(@PathVariable int userId){
		return repo.findUserById(userId);
	}
	
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	  public String extractOrder(@RequestBody User user){
	    return repo.create(user).toString();
	    
	  }

	
}




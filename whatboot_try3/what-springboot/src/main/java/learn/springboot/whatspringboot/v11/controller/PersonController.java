package learn.springboot.whatspringboot.v11.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import learn.springboot.whatspringboot.v11.model.User;

@RestController
@RequestMapping(value = "/person")
// @RequestMapping(path = "/pets", method = RequestMethod.GET, consumes="application/json")
public class PersonController {

	static {
		System.out.println("PersonController-------------------");
	}
	private static List<User> customers;
	{
		customers = new ArrayList<>();
		customers.add(new User("x12","AA","Bx","cc@email.cc") );
		customers.add(new User("x15","Ab","By","cc@email.cc") );
		customers.add(new User("x22","Ac","Bz","cc@email.cc") );
		customers.add(new User("x52","Ad","Ba","cc@email.cc") );
	}



	
    @RequestMapping("/ok")
	public String healthCheck() {
		return "OK";
	}

	@RequestMapping(path = "/b" , method = RequestMethod.GET )
	public List getPersonB() {
		return customers;
	}

	@RequestMapping(path = "/f" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getPersonF( ) {
		User person = new User("x12","AA","BB","cc@email.cc");
		
		return person;
	}

	@RequestMapping(path = "/a", method = RequestMethod.GET, produces = "application/json")
	public User getPersonA( ) {
		User person = new User("x12","AA","BB","cc@email.cc");
		
		return person;
	}


	@RequestMapping(path = "/c", method = RequestMethod.GET, produces = "application/json")
	public User getPersonC( ) {
		User person = new User("x12","AA","BB","cc@email.cc");
		
		return person;
	}
	@RequestMapping(value = "/e", method = RequestMethod.GET,headers="Accept=application/json")
	public User getPersonE( ) {
		User person = new User("x12","AA","BB","cc@email.cc");
		
		return person;
	}
}

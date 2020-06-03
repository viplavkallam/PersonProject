/**
 * 
 */
package com.viplav.spring.boot.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.viplav.spring.pojo.Person;
import com.viplav.spring.service.PersonService;

/**
 * @author vkallam2
 *
 */
@Controller
public class PersonController {
@Autowired
PersonService personService;
	@PostMapping("/person/add")
	public String addPerson(@RequestBody Person person) {
		personService.addPerson(person);
		return "Success";
	}
	@PostMapping("/person/{id}")
	public String deletePerson(@PathParam(value = "id") int id) {
		
		return null;
	}
}

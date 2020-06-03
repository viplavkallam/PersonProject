/**
 * 
 */
package com.viplav.spring.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author vkallam2
 *
 */
@Controller
public class TestController {

	@GetMapping("/test")
	public ResponseEntity<String> sayHello(){
		System.out.println("Inside the sayHello() method:::::");
		return new ResponseEntity<String>(new String("Welcome to String app"), HttpStatus.OK);
	}
}

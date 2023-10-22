package com.myapp01.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class InitialController {
	
	@GetMapping("initial")
	@CrossOrigin
	public Initial initialDisplay() {
		Initial initial = new Initial("Hello World", "You are new special one!");
		return initial;
	}
}

class Initial{
	private String message;
	private String status;
	
	Initial(String message, String status){
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

package com.spring.training;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldDefaultSingleton {
	
	private String message;
	
	public HelloWorldDefaultSingleton() {
		message= "default message";
	}

	public void sayHello() {
		System.out.println("Hello World: message: "+ message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
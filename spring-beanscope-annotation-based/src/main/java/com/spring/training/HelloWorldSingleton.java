package com.spring.training;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class HelloWorldSingleton {
	
	private String message;
	
	public HelloWorldSingleton() {
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
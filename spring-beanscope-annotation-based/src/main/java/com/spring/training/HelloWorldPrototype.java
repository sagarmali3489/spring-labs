package com.spring.training;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloWorldPrototype {
	
	private String message;
	
	public HelloWorldPrototype() {
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
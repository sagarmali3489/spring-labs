package com.spring.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.HelloWorldPrototype;

public class HelloWorldPrototypeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorldPrototype instance1 = context.getBean(HelloWorldPrototype.class);
		instance1.sayHello();
		
		HelloWorldPrototype instance2 = context.getBean(HelloWorldPrototype.class);
		instance2.sayHello();
		
		instance1.setMessage("Instance 1 setting the message");
		
		instance1.sayHello();
		instance2.sayHello();
	}
}
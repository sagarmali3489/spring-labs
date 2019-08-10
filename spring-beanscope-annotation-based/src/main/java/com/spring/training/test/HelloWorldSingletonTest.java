package com.spring.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.HelloWorldSingleton;

public class HelloWorldSingletonTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorldSingleton instance1 = context.getBean(HelloWorldSingleton.class);
		instance1.sayHello();
		
		HelloWorldSingleton instance2 = context.getBean(HelloWorldSingleton.class);
		instance2.sayHello();
		
		instance1.setMessage("Instance 1 setting the message");
		
		instance1.sayHello();
		instance2.sayHello();
	}
}
package com.spring.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.HelloWorldDefaultSingleton;

public class HelloWorldDefaultSingletonTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorldDefaultSingleton instance1 = context.getBean(HelloWorldDefaultSingleton.class);
		instance1.sayHello();
		
		HelloWorldDefaultSingleton instance2 = context.getBean(HelloWorldDefaultSingleton.class);
		instance2.sayHello();
		
		instance1.setMessage("Instance 1 setting the message");
		
		instance1.sayHello();
		instance2.sayHello();
	}
}
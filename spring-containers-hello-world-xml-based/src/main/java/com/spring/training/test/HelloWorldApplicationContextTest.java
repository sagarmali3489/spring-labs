package com.spring.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.HelloWorld;

public class HelloWorldApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.sayHello();
	}
}
package com.spring.training.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.HelloWorld;

public class HelloWorldBeanFactoryTest {

	public static void main(String[] args) {
		BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.sayHello();
	}
}
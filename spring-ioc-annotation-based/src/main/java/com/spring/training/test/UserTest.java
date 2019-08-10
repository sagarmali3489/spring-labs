package com.spring.training.test;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.User;

public class UserTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		User user1 = context.getBean(User.class);
		user1.setId(new Random().nextInt());
		user1.setName("John");
		user1.getAddress().setAddressLine("Gold Park");
		user1.getAddress().setCity("San Francisco");
		System.out.println(user1);
		
		User user2 = context.getBean(User.class);
		user2.setId(new Random().nextInt());
		user2.setName("Pinto");
		user2.getAddress().setAddressLine("Silver Park");
		user2.getAddress().setCity("San Jose");
		System.out.println(user2);
		
	}
}

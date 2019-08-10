package com.spring.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.models.User;
import com.spring.training.services.UserService;

public class UserServiceTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		UserService service1 = context.getBean(UserService.class);
		
		User user1 = context.getBean(User.class);
		service1.createUser(user1, "John", 30, "Gold Park");
		System.out.println(user1);
		
		User user2 = context.getBean(User.class);
		service1.createUser(user2, "Pinto", 32, "Silver Park");
		System.out.println(user2);
		
		service1.updateUser(user1.getId(), "Nimo", 50, "Platinum Park");
		System.out.println(user1);
		
		System.out.println(service1.getUser(user1.getId()));
		
		System.out.println(service1.getUsers());
	}
}

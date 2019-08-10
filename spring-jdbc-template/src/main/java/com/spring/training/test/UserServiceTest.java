package com.spring.training.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.models.User;
import com.spring.training.services.UserService;

public class UserServiceTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		UserService service1 = context.getBean(UserService.class);
		
		User user1 = context.getBean(User.class);
		service1.createUser(1,  "John", 30, "Gold Park");
		
		User tempUser = service1.getUser(1);
		
		User user2 = context.getBean(User.class);
		service1.createUser(2, "Pinto", 32, "Silver Park");

		service1.updateUser(2, "Nimo", 55, "Platinum Park");
		
		service1.getUsers();

		service1.removeUser(1);
		
		service1.getUsers();
	}
}

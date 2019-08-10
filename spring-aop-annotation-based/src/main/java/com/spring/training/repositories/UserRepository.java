package com.spring.training.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.spring.training.models.User;

@Repository
public class UserRepository {
	
	private Map<Integer, User> usersMap = new HashMap();
	
	public User createUser(User user, String name, Integer age, String addressLine) {
		System.out.println("UserRepository: createUser");
		user.setId(new Random().nextInt());
		user.setName(name);
		user.setAge(age);
		user.getAddress().setAddressLine(addressLine);
		
		usersMap.put(user.getId(), user);
		
		return user;
	}
	
	public User updateUser(Integer id, String name, Integer age, String addressLine) {
		System.out.println("UserRepository: updateUser");
		User user = usersMap.get(id);
		
		if(user != null) {
			user.setName(name);
			user.setAge(age);
			user.getAddress().setAddressLine(addressLine);
			return user;
		}
		
		return null;
	}
	
	public void removeUser(Integer id) {
		System.out.println("UserRepository: removeUser");
		usersMap.remove(id);
	}
	
	public User getUser(Integer id) {
		System.out.println("UserRepository: getUser");
		return usersMap.get(id);
	}
	
	public List<User> getUsers() {
		System.out.println("UserRepository: getUsers");
		return new ArrayList<User>(usersMap.values());
	}
}
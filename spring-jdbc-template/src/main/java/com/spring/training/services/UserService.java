package com.spring.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.training.models.User;
import com.spring.training.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public int createUser(Integer id, String name, Integer age, String addressLine) {
		System.out.println("UserService: createUser");
		return userRepository.createUser(id, name, age, addressLine);
	}
	
	public int updateUser(Integer id, String name, Integer age, String addressLine) {
		System.out.println("UserService: updateUser");
		return userRepository.updateUser(id, name, age, addressLine);
	}
	
	public void removeUser(Integer id) {
		System.out.println("UserService: removeUser");
		userRepository.removeUser(id);
	}
	
	public User getUser(Integer id) {
		System.out.println("UserService: getUser");
		return userRepository.getUser(id);
	}
	
	public List<User> getUsers() {
		System.out.println("UserService: getUsers");
		return userRepository.getUsers();
	}
}

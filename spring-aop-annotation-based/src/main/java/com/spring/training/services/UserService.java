package com.spring.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.training.models.User;
import com.spring.training.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User createUser(User user, String name, Integer age, String addressLine) {
		System.out.println("UserService: createUser");
		return repository.createUser(user, name, age, addressLine);
	}
	
	public User updateUser(Integer id, String name, Integer age, String addressLine) {
		System.out.println("UserService: updateUser");
		return repository.updateUser(id, name, age, addressLine);
	}
	
	public void removeUser(Integer id) {
		System.out.println("UserService: removeUser");
		repository.removeUser(id);
	}
	
	public User getUser(Integer id) {
		System.out.println("UserService: getUser");
		return repository.getUser(id);
	}
	
	public List<User> getUsers() {
		System.out.println("UserService: getUsers");
		return repository.getUsers();
	}
}

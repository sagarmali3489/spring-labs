package com.spring.training.constructor.injection;

import java.util.Random;

public class Employee {
	
	private Integer id;
	private String name;
	private Integer age;
	
	private Organization organization;
	
	public Employee() {
		this.id = new Random().nextInt();
	}
	
	public Employee(String name, Integer age, Organization organization) {
		super();
		this.id = new Random().nextInt();
		this.name = name;
		this.age = age;
		this.organization = organization;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "User [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (age != null ? "age=" + age + ", " : "") + (organization != null ? "organization=" + organization : "") + "]";
	}

}

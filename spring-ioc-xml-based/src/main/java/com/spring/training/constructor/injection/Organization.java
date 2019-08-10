package com.spring.training.constructor.injection;

import java.util.Random;

public class Organization {
	
	private Integer id;
	private String name;
	
	public Organization() {
		this.id = new Random().nextInt();
	}
	
	public Organization(String name) {
		super();
		
		this.id = new Random().nextInt();
		this.name = name;
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
	@Override
	public String toString() {
		return "Organization [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name : "") + "]";
	}
	
}

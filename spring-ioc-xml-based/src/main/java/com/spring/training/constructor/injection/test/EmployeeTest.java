package com.spring.training.constructor.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.constructor.injection.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		/**
		 * Singleton beans by default
		 */
		Employee employee1 = (Employee) context.getBean("employee");
		employee1.setAge(35);
		System.out.println(employee1);
		
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(employee2);
		
		/**
		 * Prototype beans
		 */
		Employee employee3 = (Employee) context.getBean("employee1");
		employee3.setAge(32);
		System.out.println(employee3);
		
		Employee employee4 = (Employee) context.getBean("employee1");
		System.out.println(employee4);
		
		/**
		 * Prototype beans setter injection
		 */
		Employee employee5 = (Employee) context.getBean("employee2");
		employee5.setAge(52);
		System.out.println(employee5);
		
		Employee employee6 = (Employee) context.getBean("employee2");
		System.out.println(employee6);
	}
}

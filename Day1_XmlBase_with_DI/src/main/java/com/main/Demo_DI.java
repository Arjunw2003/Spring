package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Department;
import com.entity.Employee;

public class Demo_DI {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Department department = context.getBean("d", Department.class);
		Employee employee = context.getBean( Employee.class);

		System.out.println(department);
		System.out.println(employee);

	}
}

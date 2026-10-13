package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class Demo_ioc {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Employee emp = context.getBean("emp1", Employee.class);
		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp2", Employee.class);

//		1
//		emp.setId(12);
//		emp.setName("Arjun");
//		emp.setAge(21);
//		emp.setCity("Pune");
//
//		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
	}

}

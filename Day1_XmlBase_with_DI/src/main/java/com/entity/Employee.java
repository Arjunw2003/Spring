package com.entity;

public class Employee {

	int emp_Id;
	String emp_name;
	int emp_age;
	String emp_city;
	
	Department dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_Id, String emp_name, int emp_age, String emp_city, Department dept) {
		super();
		this.emp_Id = emp_Id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_city = emp_city;
		this.dept = dept;

	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_name=" + emp_name + ", emp_age=" + emp_age + ", emp_city="
				+ emp_city + ", dept=" + dept + "]";
	}

}

package com.entity;

public class Department {

	int dept_Id;
	String dept_Name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dept_Id, String dept_Name) {
		super();
		this.dept_Id = dept_Id;
		this.dept_Name = dept_Name;
	}

	public int getDept_Id() {
		return dept_Id;
	}

	public void setDept_Id(int dept_Id) {
		this.dept_Id = dept_Id;
	}

	public String getDept_Name() {
		return dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}

	@Override
	public String toString() {
		return "Department [dept_Id=" + dept_Id + ", dept_Name=" + dept_Name + "]";
	}

}

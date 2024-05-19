package com.logical.java8.other;

public class Employee {

	private String name;
	private String gender;
	private Integer age;
	private String department;

	public Employee(String name, String gender, Integer age, String department) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + ", department=" + department + "]";
	}

}

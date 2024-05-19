package com.logical.java8.other;

import java.util.Arrays;
import java.util.List;

public class EmployeesRepo {

	public List<Employee> getEmployeList() {
		Employee emp1 = new Employee("Ashish", "male", 31, "software");
		Employee emp2 = new Employee("Smruti", "female", 16, "makeup");
		Employee emp3 = new Employee("Rahul", "male", 34, "mechanic");
		Employee emp4 = new Employee("Rani", "female", 12, "makeup");
		Employee emp5 = new Employee("Rakesh", "male", 60, "electrical");
		Employee emp6 = new Employee("Rocky", "male", 45, "mechanic");

		List<Employee> employList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
		return employList;
	}
}

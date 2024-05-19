package com.logical.java8;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.logical.java8.other.Employee;
import com.logical.java8.other.EmployeesRepo;

public class GroupEmployees {
	public static void main(String[] args) {

		List<Employee> employList = new EmployeesRepo().getEmployeList();

		// Find employees cound working in each department
		Map<String, Long> departmentAndCountMap = employList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));
		System.out.println(departmentAndCountMap);

		// find max age for each department employee
		Map<String, Optional<Employee>> departmentAndmaxAgeMap = employList.stream().collect(Collectors
				.groupingBy(emp -> emp.getDepartment(), Collectors.maxBy((x, y) -> x.getAge().compareTo(y.getAge()))));
		System.out.println(departmentAndmaxAgeMap);
	}
}

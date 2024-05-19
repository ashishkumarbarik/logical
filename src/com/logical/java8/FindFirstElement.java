package com.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
	public static void main(String[] args) {

		// Create a list of strings
		List<String> names = Arrays.asList("John", "Mary", "Bob", "Alice");

		// Find the first element in the list that is greater than 10 characters long
		Optional<String> name = names.stream().filter(s -> s.length() > 3).findFirst();

		// If the Optional object is not empty, print the name
		if (name.isPresent()) {
			System.out.println(name.get());
		} else {
			System.out.println("No names found");
		}

	}
}

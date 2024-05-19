package com.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyElement {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c", "d");

		// Find any element in the list that is greater than "b"
		Optional<String> result = list.stream().filter(s -> s.compareTo("b") > 0).findAny();

		// If the result is present, print it out
		if (result.isPresent()) {
			System.out.println(result.get());
		}

	}
}

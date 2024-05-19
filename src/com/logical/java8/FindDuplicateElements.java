package com.logical.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ashish", "smruti", "ashish", "ram", "hari", "ram");

		// Find the duplicate elements using a Stream
		Set<String> duplicates = names.stream().filter(i -> Collections.frequency(names, i) > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicates);

	}

}

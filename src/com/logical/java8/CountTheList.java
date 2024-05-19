package com.logical.java8;

import java.util.Arrays;
import java.util.List;

public class CountTheList {

	public static void main(String[] args) {
		
		// find the total count of the list.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Total count - " + numbers.stream().count());
		
		
	}
}

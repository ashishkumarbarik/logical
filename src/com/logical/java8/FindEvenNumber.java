package com.logical.java8;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {
	public static void main(String[] args) {

		// Find event number using stream API
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> evenNumberList = numbers.stream().filter(num -> num % 2 == 0).toList();
		System.out.println("event numbers" + evenNumberList);

	}
}

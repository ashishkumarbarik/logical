package com.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheSumOfNumbers {

	public static void main(String[] args) {
		
		// Find the sum of the all numbers in the list
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		/**
		 * here mapToInt returns IntStream which contains some utils methods for
		 * numbers.
		 */
		Integer sum = numbers.stream().mapToInt(x -> x.intValue()).sum();
		System.out.println(sum);

		Integer sum2 = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum2);

		Integer sum3 = numbers.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum3);

	}
}

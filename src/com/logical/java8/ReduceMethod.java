package com.logical.java8;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
	public static void main(String[] args) {

		// Find the max value from the list
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer maxNum = numbers.stream().reduce(0, (x, y) -> x > y ? x : y);
		System.out.println("Max num - " + maxNum);

		Integer maxNum2 = numbers.stream().reduce((x, y) -> x > y ? x : y).get();
		System.out.println("Max num - " + maxNum2);

	}
}

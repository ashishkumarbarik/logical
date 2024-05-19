package com.logical.java8;

import java.util.Arrays;
import java.util.List;

public class FindMinMaxnumber {
	public static void main(String[] args) {
		
		// find min and max number from the list.
		List<Integer> numbers = Arrays.asList(6, 24, 30, 41, 56, 6, 76, 8, 9);
		int min = numbers.stream().min((x, y) -> y - x).get();
		int max = numbers.stream().max((x, y) -> y - x).get();
		System.out.println("min - " + min + "   max - " + max);
		
	}
}

package com.logical.java8;

import java.util.Arrays;
import java.util.List;

public class MultiplyEachNumberBySomeNumber {
	public static void main(String[] args) {
		
		//multiply each number with 2 fo the give number list
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> newNumbers = numbers.stream().map(num -> num * 2).toList();
		System.out.println("new numbers - " + newNumbers);
		
	}
}

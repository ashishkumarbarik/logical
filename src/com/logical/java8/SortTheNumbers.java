package com.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTheNumbers {

	public static void main(String[] args) {

		// sort the given numbers in the list.
		List<Integer> numbers = Arrays.asList(6, 24, 30, 41, 56, 6, 76, 8, 9);
		List<Integer> sortedNumbers = numbers.stream().sorted().toList();
		System.out.println("sorted numbers - " + sortedNumbers);

		// sort the given numbers in the list using comparator.
		/*
		 * Here Comparator interface is Functional interface and it accepts 2 number and
		 * return integer.
		 */
		List<Integer> reverseSortedNumbers = numbers.stream().sorted((x, y) -> y - x).toList();
		System.out.println("reverse sorted numbers - " + reverseSortedNumbers);

		// Here by using the static method(some utils method) of interface we can
		// reverse the order.
		List<Integer> reverseSortedNumbers2 = numbers.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("reverse sorted numbers - " + reverseSortedNumbers2);

		// Here by using compareTo
		List<Integer> reverseSortedNumbers3 = numbers.stream().sorted((x, y) -> x.compareTo(y)).toList();
		System.out.println("reverse sorted numbers - " + reverseSortedNumbers3);

		// Sort the string based on length
		List<String> names = Arrays.asList("sad", "wefddf", "d", "dddddddd");
		List<String> sortedbasedOnStringLength = names.stream().sorted((x, y) -> x.length() - y.length()).toList();
		System.out.println("sortedbasedOnStringLength -- " + sortedbasedOnStringLength);
		
		
	}

}

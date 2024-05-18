package com.logical.programs;

public class FindEventAndOddNumber {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println("Number is even - " + numbers[i]);
			} else {
				System.out.println("Number is odd - " + numbers[i]);
			}
		}

	}
}

package com.logical.programs;

public class PalindromeStringCheck {
	//How do you determine if a string is a palindrome?
	public static void main(String[] args) {
		String palindromeString = "Ashishhsihsa";

		String reverseString = "";
		for (int i = 0; i < palindromeString.length(); i++) {
			reverseString = palindromeString.charAt(i) + reverseString;
		}

		System.out.println("reverseString string - " + reverseString);
		if (reverseString.equalsIgnoreCase(palindromeString)) {
			System.out.println("It is a palindrom string");
		} else {
			System.out.println("It is not a palindrom string");
		}
	}
}

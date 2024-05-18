package com.logical.programs;

public class ReverseAString {

	public static void main(String[] args) {
		String myName = "Ashish kumar Barik";
		String reverseString1 = "";

		for (int i = 0; i < myName.length(); i++) {
			reverseString1 = myName.charAt(i) + reverseString1;
		}
		System.out.println("reverse string - " + reverseString1);

		String reverseString2 = "";
		for (int i = myName.length() - 1; i >= 0; i--) {
			reverseString2 = reverseString2 + myName.charAt(i);
		}
		System.out.println("reverse string - " + reverseString2);
	}

}

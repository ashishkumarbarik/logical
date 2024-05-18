package com.logical.programs;

public class OccuranceOfCharInAString {

	public static void main(String[] args) {
		// Find the number of occurrences of a character in a String?

		String anyString = "Ashish kumar barik";
		char searchChar = 'a';
		anyString = anyString.toLowerCase();
		searchChar = Character.toLowerCase(searchChar);
		int totalOccurrence = 0;
		for (int i = 0; i < anyString.length(); i++) {
			if (anyString.charAt(i) == searchChar) {
				totalOccurrence = totalOccurrence + 1;
			}
		}
		System.out.println("Total occurrence of char : " + searchChar + " is : " + totalOccurrence);

	}

}

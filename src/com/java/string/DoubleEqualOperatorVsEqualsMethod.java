package com.java.string;

public class DoubleEqualOperatorVsEqualsMethod {
	public static void main(String[] args) {

		String str1 = new String("Ashish");
		String str2 = new String("Ashish");

		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2));// true

		
		
		StringBuffer strBfr1 = new StringBuffer("Ashish");
		StringBuffer strBfr2 = new StringBuffer("Ashish");

		System.out.println(strBfr1 == strBfr2);// false
		System.out.println(strBfr1.equals(strBfr2));// false

	}
}

package com.java.string;

public class StringVsStringBufferImmutableAndMutable {

	public static void main(String[] args) {

		String str1 = "Ashish";
		str1.concat("Barik");
		System.out.println("String : " + str1); // Ashish

		String newStr = str1.concat("Barik");
		System.out.println("New modified String : " + newStr); // AshishBarik

		StringBuffer strBfr = new StringBuffer("Smruti");
		strBfr.append("Rekha");
		System.out.println("StringBuffer : " + strBfr); // SmrutiRekha
	}
}

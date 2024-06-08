package com.java.string;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {

		String str1 = "Ashish";
		String str2 = new String("Barik");

		StringBuffer strBfr = new StringBuffer("Smruti");
		strBfr.append("Rekha");

		StringBuilder strBldr = new StringBuilder("Rani");
		strBldr.append("Das");

		StringBuffer strBfr2 = new StringBuffer();
		strBfr2.append("1234567890123456323");

		StringBuilder strBldr2 = new StringBuilder();

		System.out.println("String literal  " + str1);
		System.out.println("String object  " + str2);
		System.out.println("Stringbuffer  " + strBfr);
		System.out.println("StringBuilder  " + strBldr);

		System.out.println("Stringbuffer capacity " + strBfr2.capacity());
		System.out.println("StringBuilder capacity " + strBldr2.capacity());

		//String str3 = strBfr2;
		//String str4 = strBldr2;
		//StringBuilder stBldr3 = new String("saduhksa");
		//StringBuffer strbfr3 = new String("adscas");
		//StringBuffer strbfr4 = new StringBuilder();

		// output
		// String literal Ashish
		// String object Barik
		// Stringbuffer SmrutiRekha
		// StringBuilder RaniDas
		// Stringbuffer capacity 34
		// StringBuilder capacity 16

	}
}

package com.java.string;

public class StringBufferVsStringBuilderPerformance {

	public static void main(String[] args) {

		StringBuffer strBfr = new StringBuffer("Smruti");

		StringBuilder strBldr = new StringBuilder("Rani");

		var startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBfr.append("Rekha");
		}
		var endTime1 = System.currentTimeMillis();

		var startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBldr.append("Das");
		}
		var endTime2 = System.currentTimeMillis();

		System.out.println("Stringbuffer capacity " + (endTime1 - startTime1));
		System.out.println("Stringbuilder capacity " + (endTime2 - startTime2));

		// output
		// Stringbuffer capacity 16
		// Stringbuilder capacity 5

	}
}

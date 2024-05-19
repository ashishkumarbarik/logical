package com.logical.java8;

import java.util.Arrays;
import java.util.List;

public class ConvertStreamToArray {
	public static void main(String[] args) {
		
		// How to convert stream to array
		List<String> names = Arrays.asList("dsad", "fgfd", "ytuyt", "oiip");
		String[] nameArray = names.stream().toArray(arraySize -> new String[arraySize]);
		
	}
}

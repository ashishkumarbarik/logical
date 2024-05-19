package com.logical.java8;

import java.util.Arrays;
import java.util.List;

public class ForLoop {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("dsad", "fgfd", "ytuyt", "oiip");
		names.stream().forEach(x -> System.out.println("new String - " + "Ashish --" + x));
		
	}
}

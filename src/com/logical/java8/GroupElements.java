package com.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElements {

	public static void main(String[] args) {

		// find the total counts which having title barik
		// that means we have to group by title.
		List<String> names = Arrays.asList("Ashish barik", "Smrutirekha das", "Smrutirekha das", "Smrutirekha das",
				"rahul barik", "Anil barik", "Anil barik", "Smrutirekha das");
		Map<String, Long> map = names.stream()
				.collect(Collectors.groupingBy(x -> x.split("\\s")[1], Collectors.counting()));
		System.out.println(map);

	}

}

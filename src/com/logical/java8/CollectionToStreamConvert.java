package com.logical.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStreamConvert {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ashish");
		names.add("Smruti");
		names.add("Ashish-2");
		names.add("Smruti-2");
		names.add("Ashish-3");
		names.add("Smruti-3");
		System.out.println("names - " + names);

		String[] nameArray = new String[5];
		nameArray[0] = "Ashish";
		nameArray[1] = "Smruti";

		// convert collection to stream
		Stream<String> nameStream = names.stream();

		// convert array to collection -1
		Stream<String> nameStream2 = Arrays.stream(nameArray);

		// convert array to collection -1
		Stream<String> nameStream3 = Stream.of(nameArray);

	}
}

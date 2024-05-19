package com.logical.java8;

import java.util.stream.Stream;

public class SkipElementsFromAList {
	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Skip the first 5 elements of the stream
		Stream<Integer> skippedStream = stream.skip(5);

		// Print the remaining elements of the stream
		skippedStream.forEach(System.out::println);//6,7,8,9,10

	}
}

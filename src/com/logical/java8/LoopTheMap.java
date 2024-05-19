package com.logical.java8;

import java.util.HashMap;
import java.util.Map;

public class LoopTheMap {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		
		hm.forEach((key, value) -> {
			System.out.println("key : " + key + "   " + "value : " + value);
		});

		hm.entrySet().stream().forEach(entry -> {
			System.out.println("key : " + entry.getKey() + "   " + "value : " + entry.getValue());
		});
		
	}
}

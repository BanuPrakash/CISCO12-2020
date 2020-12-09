package com.cisco.prj.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Double> bookMap = new HashMap<String, Double>();
		bookMap.put("Java", 450.00);
		bookMap.put("JavaScript", 1200.00);
		bookMap.put("Docker", 450.00);
		
		bookMap.put("Java", 600.00); // over write
		
		System.out.println(bookMap.get("Docker")); 
		
		System.out.println("**********");
		
		Set<String> keys = bookMap.keySet();
		
		for(String key : keys) {
			System.out.println(key + " : "+ bookMap.get(key));
		}
		
		System.out.println("********");
		
		
		bookMap.forEach((k,v) -> {
			System.out.println(k + " : " + v);
		});
	}

}

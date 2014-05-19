package com.gga.lesson140519.collections;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		people.put("John", "New-York");
		people.put("Pete", "Boston");
		people.put("Mary", "Oston");
		people.put("Mary", "Chicago");
		
		
		System.out.println(people);
		String[] p = new String[4];
	
		char c = "John".charAt(0);
		int index = c % people.size();
		p[index] = "New-York";
		
	}
	

	
	
	

}

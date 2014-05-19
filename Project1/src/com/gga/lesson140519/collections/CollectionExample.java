package com.gga.lesson140519.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionExample {
	
	public static void main(String[] args) {
		Collection<String> names = new LinkedList<String>();
		names.add("John");
		names.add("Mary");
		names.add("Ann");
		names.add("Petr");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		Collection<String> names2 = new ArrayList<>();
		names2.addAll(names);
		System.out.println(names2);

		Collection<String> names3 = new ArrayDeque<>();
		names3.add("Mary");
		names3.add("Ann");
		names3.add("Steve");
		names3.add("Tom");
		
		names.retainAll(names3);
		System.out.println(names);
		
		String[] arrayOfNames = names.toArray(new String[0]);
		for (String array : arrayOfNames) {
			System.out.println(array);
		}
		
	}
	
	
	

}

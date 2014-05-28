package com.gga.lesson140526;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModifyableExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(-10);
		list.add(20);
		list.add(70);
		list.add(12);
		
		System.out.println(list);
		
		List<Integer> list2 = Collections.unmodifiableList(list);
		
		// list2.add(23); // Error Exceptions
		
	}
}

package com.gga.lesson140526;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedWrapperExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		List list2 = list;
		
		list2.add(23);
		list2.add("hello");
		list2.add(234);
		
		System.out.println(list2);
		
		List<Integer> checkedList = Collections.checkedList(list2, Integer.class);
		list2 = checkedList;
	    //  list2.add("Hello 2"); Error
		
	}
}

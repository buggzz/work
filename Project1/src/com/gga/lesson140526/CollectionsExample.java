package com.gga.lesson140526;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(15);
		list.add(10);
		list.add(8);
		
		System.out.println(list);
		
		Collections.rotate(list, 2);
		
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);
	}
}

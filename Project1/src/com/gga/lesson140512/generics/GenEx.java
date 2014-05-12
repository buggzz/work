package com.gga.lesson140512.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.gga.lesson140303.A;


public class GenEx {
	static class A {
		
	}

	public static void main(String[] args) {
		
		Vector<String> vs = new Vector<>();
		//vs.add(new Integer(10));
		vs.add("hello");
		String s = vs.get(0);
		
		Vector<Integer> vi = new Vector<>();
		//vi.add("hello");
		vi.add(10);
		int i = vi.get(0);
		System.out.println(i);
		
		List<A> list = new ArrayList<A>();
		list.add(new A());
		A a = list.get(0);
	}

}

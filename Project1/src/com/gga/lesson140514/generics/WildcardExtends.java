package com.gga.lesson140514.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildcardExtends {
	
	public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	    List<Integer> list2 = new ArrayList<>();
	    print(list);
	    print(list2);
	    
	    List<Float> list3 = new LinkedList<>();
	    
	    sum(list2);
	    sum(list3);
	    //sum(list); Compile error
	}

	private static double sum(List<? extends Number> list) {
		double sum = 0;
        for (Number number : list) {
		    sum += number.doubleValue(); 
		}
        return sum;
	}

	private static void print(List<? extends Object> list ) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
}

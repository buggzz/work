package com.gga.lesson140514.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardSuperExtends {

	public static void main(String[] args) {
		List<Object> obj = Arrays.<Object>asList(2, 3.14, "hello");
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Integer> intDst = Arrays.asList(5, 6);
		
		WildcardSuperExtends.<Integer>copy(ints, obj);
		WildcardSuperExtends.<Integer>copy(ints, intDst);
	//	WildcardSuperExtends.<Object>copy(obj, intDst);
		
		for (Object object : obj) {
			System.out.println(object);
		}
	}
	
	public static <T> void copy(List<? extends T> src, List<? super T> dst) {
		for(int i = 0; i < src.size(); i++) {
			dst.set(i, src.get(i));
		}
	}
}

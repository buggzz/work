package com.gga.lesson140514.generics;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfTypeParam {

	public static<E> void foo(List<E> list) {
		if (list.instanceof ArrayList<Integer>) {
			//
		}
		
		List<Integer> l = (List<Integer>) list;
	}
}

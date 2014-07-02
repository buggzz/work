package com.gga.lesson140702;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConcurrentLists {
    public static void main(MainParameter parameterObject) {
		List<String> q = new LinkedList<>();
		
		List<String> synchronizedList  = Collections.synchronizedList(q);
	
	}
	
}

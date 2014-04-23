package com.gga.lesson140303.statics;

import java.util.List;
import java.util.ArrayList;

public class A {

	static int count;
	static List<A> object = new ArrayList<A>();
	
	String _name;
	
	int state;
	
	{
		object.add(this);
		count++;
	}
	
	public A() {
		_name = "I am object of A number " + count;
	//	System.out.println(_name);
	}
	
	static int getCount() {
		return count;
	}
	
	static public void classMethod() {
		System.out.println("class method " + A.class);
	}
	
	public void instanceMethod() {
		System.out.println("instance method " + this.getClass());
		System.out.println(this.getClass().getClass());
		System.out.println(this.getClass());
	}
}

package com.gga.lesson140512.generics;

import java.io.Serializable;

public class B<T extends Number & Serializable> {

	T state;
	
	public B(T state) {
		this.state = state;
	}
	
	public T getstate() {
		return state;
	}
	
	public static void main(String[] args) {
    //	B<String> b = new B<String>("zxc"); Compile Error
	//	System.out.println(b.state);
		Number n;
		B<Integer> b = new B<Integer>(10);
		B<Double> b2 = new B<Double>(15.2);
		
		B<Number> b3 = new B<Number>(12);
	//	B<Number> b4 = new B<Integer>(12); Error
		B<? extends Number> b5 = new B<Integer>(12);
		
		
	}
}

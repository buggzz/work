package com.gga.lesson140512.generics;

public class A<T> {

	T state;
	public A(T state) {
		this.state = state;
	}
	
	
	T getState() {
		return state;
	}
	
	public static void main(String[] args) {
		
		A<String> a = new A<>("hello");
		A<Integer> a2 = new A<>(10);
		
	}
	
}

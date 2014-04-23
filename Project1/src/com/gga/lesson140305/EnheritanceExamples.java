package com.gga.lesson140305;

public class EnheritanceExamples {

	public static void main(String[] args) {
		A a = new A();
		
		a.setState(10);
		System.out.println(a.getState());
		
		B b = new B();
		b.setState(20);
		System.out.println(b.getState());
		b.doubleState();
		System.out.println(b.getState());

	}

}

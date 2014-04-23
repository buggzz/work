package com.gga.lesson140226;

public class UseA {

	public static void main(String[] args) {
		
		A a = new A(20);
		a.changeState();
		System.out.println(a.state);
		a.changeState();
		System.out.println(a.state);
		
		A a2 = new A(30);
		a2.changeState();
		System.out.println(a2.state);
		
		A a3 = a;
		System.out.println(a3);
		
		A a4 = new A();
		System.out.println(a4.state);
	}

}

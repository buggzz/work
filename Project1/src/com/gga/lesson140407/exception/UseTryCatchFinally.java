package com.gga.lesson140407.exception;

public class UseTryCatchFinally {

	public static void main(String[] args) {
		doSomething();
	}

	private static void doSomething() {
		System.out.println("before");
	    try {
	    	System.out.println("include");
	    	doIt1();
	    	System.out.println("include2");
		} catch (Exception e) {
			System.out.println("catch");
			doIt2();	    	
	    } finally {
	    	System.out.println("finally");
	    }
	    System.out.println("after");
	}
	
	private static void  doIt1 () {
	 throw new RuntimeException();
	}
	
	private static void  doIt2 () {
		throw new RuntimeException();
	}
	
}

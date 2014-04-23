package com.gga.lesson140407.exception;

public class UseFinally {
    public static void main(String[] args) {
    	 //get resource
    	System.out.println("open");
		try {
			//work with resource
			System.out.println("work");
			dosomething();
			System.out.println("continiue work");
		} finally {
			//free resource
			System.out.println("close");
		}
		System.out.println("finish");
	}

	private static void dosomething() {
	    throw new RuntimeException("disaster");
	}
	
}

package com.gga.lesson140219;

public class Hello {

	public static void main(String[] p) {
		System.out.println("Hello, World!");
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("Args " + i + " = " +  p[i]);
		}
		
	    int i = 0;
	    while (i<p.length){
		    System.out.println("Args " + i + " = " +  p[i++]);
   //	    i++;
	    }
	    
	    for (String parameter : p) {
	    	System.out.println("Args = " +  parameter);
	    }
	    
	    i = 0;
	    do {
	        System.out.println("Args " + i + " = " +  p[i++]);
	    } while ( i < p.length);
	    		
	}
}
	
package com.gga.lesson140428;

import java.util.Hashtable;

public class Examples {
    public static void main(String[] args) {
		int a;
		Integer i = new Integer(10);
		
		Hashtable t = new Hashtable();
		t.put("John", "341-15-76");
		t.put("Stranger", "2-12-341-15-76");
		
		System.out.println(t.get("John"));
		
		t.put(new Integer(12345), "Smith");
		
		Integer i1 = new Integer(42);
		Integer i2 = new Integer(42);
		System.out.println();
		
	}    
    
    static int getIntValue(Integer iv) {
        return iv;	
    }
 
	
}

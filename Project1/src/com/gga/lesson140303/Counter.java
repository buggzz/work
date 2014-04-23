package com.gga.lesson140303;

public class Counter {
   private int count = 0;
    
    public void inc() {
    	count++;
    	System.out.println("Changed state of counter - " + this.count);
    } 
    
    public int get() {
    	System.out.println("Requested state of counter - " + this.count);
    	return count;
    }
}

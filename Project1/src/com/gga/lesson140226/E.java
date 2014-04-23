package com.gga.lesson140226;

public class E {
    
	{
	    System.out.println("initialized " + this);	
	}
	
	public E() {
        System.out.println("created " + this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("destroyed " + this);
	}
	
}
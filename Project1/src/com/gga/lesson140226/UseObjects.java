package com.gga.lesson140226;

public class UseObjects {
	
	public static void main (String[] args) {
	    
		B b1 = new B ("First");
		C c = new C (b1);
		B b2 = new B ("Second");
        D d1 = new D ();		
		D d2 = new D ();
		
		c.doIt();
		c.doItAgainWith(b2);
		//d1.doIt(d2);
		
		C c2 = new C ();
		
		c2.doIt();
		
		
	}

}

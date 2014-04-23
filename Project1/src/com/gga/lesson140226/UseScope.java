package com.gga.lesson140226;

public class UseScope {
    
	public static void main (String[] args) {
		
//		B b = new B ("First");
//		{
//		    C c = new C(b);
//		    c.doIt();
//		}
//		new C().doItAgainWith(b);

		C c = new C (new B("First"));
		{
			C c2 = c;
			c2.doIt();
		}
		c.doIt();
		
	}
}

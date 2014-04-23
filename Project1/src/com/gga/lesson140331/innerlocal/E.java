package com.gga.lesson140331.innerlocal;

public class E {
	int state = 30;
	
    public I getImplementorOfI() {
    	class LocalImplementor implements I {
    	    @Override
    	    public void doIt() {
    	    	System.out.println("I did it from inside with state " + state);
    	    }
    	}
    	return new InnerImplementor();
    }
}

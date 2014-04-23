package com.gga.lesson140303.internal;


import com.gga.lesson140303.*;

public class UseAB {

	public static void main (String[] args) {
		A a = new A(20);
		a.printState();
//	    B b = new B();
	    
	    ComplexState cs = new ComplexState();

//	    cs.state1 = 10;
//	    cs.state2 = 20;
	    cs.setState(30);
	    System.out.println(cs.setState2(20));
	    
	    Counter counter = new Counter();
	    counter.inc();   // Correct call
	    counter.inc();   
        counter.get();	    
//	    counter.count++; //Incorrect call
//	    System.out.println("Changed state of counter");
//	    counter.count++;
//	    System.out.println("Changed state of counter");
 
//	    System.out.println(counter.count);
	    
	}
}

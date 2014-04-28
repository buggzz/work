package com.gga.lesson140428.enums;

import static java.lang.System.out;

public class Examples {

	enum Apple {
	    Winesap,Catland, RedDel, GoldenDel, Janathan	
	}

	public static int JONATHAN = 1;
	public static int REDDEL = 2;
	
	
	public static void main(String[] args) {
		
	    Apple ap = Apple.RedDel;
	    switch(ap) {
	    case Janathan:
	    	//
	    	break;
	    case Catland:
	    	//
	    	break;
	    case RedDel:
	    	//
	    	break;
	    case Winesap:
	    	//
	    	break;
	    }
	    
	    out.println(JONATHAN);
	    out.println(REDDEL);
	    
	    for (Apple a : Apple.values()) {
			System.out.println(a);
		}
	}
	
}

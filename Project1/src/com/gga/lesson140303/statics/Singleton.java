package com.gga.lesson140303.statics;

public class Singleton {

	private static Singleton instance;
	static int count;
	int id;
	
    static void printStatus() {
    	System.out.println("instance created = " + count);
    }

    static Singleton getInstance() { // lazy instantiation
    	if (instance == null) {
    		instance = new Singleton();
    	}
    	return instance;
    }
    
    static void setInstance(Singleton instance) {
    	Singleton.instance = instance;
    }
	
	{
		id = count++;
		System.out.println("I am newly created singleton # " + id);
	}

	private Singleton() {
	}

	public void saySomething() {
		System.out.println("something from " + id);
	}


//	static Singleton instance = new Singleton();
//	static int count;
//	int id;
//	
//	{
//		id = count++;
//		System.out.println("I am newly created singleton # " + id);
//	}
//	
//	
//	
//	private Singleton() {
//	
//	}
//
//	public void saySomething() {
//		System.out.println("something " + id);
//	}
	
	
}

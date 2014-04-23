package com.gga.lesson140303.statics;

//import java.util.concurrent.TimeUnit;

public class StaticsExample {

	public static void main(String[] args) throws InterruptedException {

		
		Singleton.printStatus();
		
		
//		A.classMethod();
//      A.instanceMethod(); //ERROR
		
//		A a = new A();
//	    a.instanceMethod();
//      a.classMethod();
	
//		new A();
//		new A();
//		new A();
//		new A();
//		
//		
//		System.out.println(A.getCount());
//		
//		for (A objectOfA : A.object) {
//			System.out.println(objectOfA._name);
//		}
		
	//	TimeUnit.SECONDS.sleep(5);
		
		Singleton.getInstance().saySomething(); 
		Singleton.getInstance().saySomething(); 
		Singleton.getInstance().saySomething(); 

	}

}

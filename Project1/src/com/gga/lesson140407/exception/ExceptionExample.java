package com.gga.lesson140407.exception;

public class ExceptionExample {


	public static class MyException extends Exception { 
        
	}
	 
	public static class MyException2 extends MyException {
		
	}

	public static void main(String[] args) {
		try {
			doSomething();
		} catch (MyException2 e) {
		//	e.printStackTrace();
			System.out.println("MyException2");
		/*} catch (MyException e) {
			System.out.println("MyException");*/
//		//	e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
		//    e.printStackTrace();
	    }

	}

	private static void doSomething() throws /*MyException, */MyException2 {
		try {
	        doAnotherThing();
		} catch (MyException e) {
            System.out.println("MyException");			
		}
		throw new MyException2();
	}

	private static void doAnotherThing() throws MyException {
		throw new MyException();
		
	}

}

package com.gga.lesson140305.inheritance.vehicle;

public class Mercedes extends Engine {
	
   @Override
public void start() {
	   System.out.println("mercedes engine start");
}

   @Override
	public void stop() {
	   System.out.println("mercedes engine stop");
	}
}

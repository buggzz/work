package com.gga.lesson140604;

public class WaitNotSynched {

	public static void main(String[] args) {
		Object mutex = new Object();
		try {
			mutex.wait(10000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
	
}

package com.gga.lesson140602;

import java.util.Random;

import com.gga.lesson140528.Utils;

public class SimulationCounterUpdateExample {

	static int counter = 0;
	static class Turniket implements Runnable {

		
		@Override
		public void run() {
		    Random random = new Random();
		    while (true) {
//		    	Utils.pause(random.nextInt(2000)+1000);
		    	Utils.pause(2000);
		    	counter++;
		    	System.out.println(Thread.currentThread().getName() + " : counter - " + counter);
		    }
		}
		
	}
	
	public static void main(String[] args) {
	    	for (int i = 0; i < 8; i++) {
				new Thread(new Turniket()).start();
			}
		
	}
	
	
}

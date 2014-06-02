package com.gga.lesson140602;

import java.util.Random;

import com.gga.lesson140528.Utils;

public class CriticalException {

    static class Counter {
	    private int counter;

//		public int getCounter() {
		synchronized public int getCounter() {
			return counter;
		}

		synchronized public void inc() {
			int tmp = counter;
			tmp = tmp + 1;
			counter = tmp;
			System.out.println(Thread.currentThread().getName() + " : counter - " + counter);
		}
	}
	
    static Counter counter = new Counter();
    
    static class Turniket implements Runnable {
    	@Override
    	public void run() {
//	        Random random = new Random();
			while (true) {
//			    	Utils.pause(random.nextInt(2000)+1000);
			    	Utils.pause(2000);
			    	counter.inc();
			}
		}
	}
		
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
		    new Thread(new Turniket()).start();
		}
	}
		
}


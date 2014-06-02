package com.gga.lesson140602;

import com.gga.lesson140528.Utils;

public class SynchronizedBlockExample {
    static class Counter {
	    private int counter;

		public void inc() {
			synchronized (this) {
				counter++;
			}
		}
		
		public int getCounter() {
			synchronized (this) {
				return counter;
			}
		}
	}
	
    static Counter counter = new Counter();
    
    static class Turniket implements Runnable {
    	@Override
    	public void run() {
			while (true) {
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

package com.gga.lesson140604;

import com.gga.lesson140528.Utils;

public class StarvationExample {

	public static void main(String[] args) {
		System.out.println("start");
		
		final Object mutex = new Object();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
	            synchronized (mutex) {
				//	while (true) {
						System.out.println(mutex);
						Utils.pause(2);
				//	}
				}
			}
		});
		
		thread.start();
		Utils.pause(5000);
		//thread.suspend();
		
		System.out.println("try to lock mutex");
		synchronized (mutex) {
			System.out.println("locked mutex");
		}
		System.out.println("finished");
	}
	
}

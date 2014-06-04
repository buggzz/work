package com.gga.lesson140604;

import com.gga.lesson140528.Utils;

public class WaitWithTimeoutExample {

	public static void main(String[] args) {
		System.out.println("start");
		
		final Object mutex = new Object();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
	            synchronized (mutex) {

	            	try {
	            		System.out.println("before wait");
						mutex.wait(10000);
						System.out.println("awaken");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
		Utils.pause(5000);
		//thread.suspend();
		
		System.out.println("try to lock mutex");
		synchronized (mutex) {
			System.out.println("locked mutex");
			Utils.pause(6000);
		}
		System.out.println("finished");
	}
	
}

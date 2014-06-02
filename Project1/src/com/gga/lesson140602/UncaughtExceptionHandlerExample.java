package com.gga.lesson140602;

import com.gga.lesson140528.Utils;

public class UncaughtExceptionHandlerExample {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("working ...");
				Utils.pause(10000);
			}
		}).start();
		
		
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t.getName() + ": " + e);
			}
	   });
			
		
		throw new RuntimeException();
	}
}

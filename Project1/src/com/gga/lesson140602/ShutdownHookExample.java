package com.gga.lesson140602;

import com.gga.lesson140528.Utils;

public class ShutdownHookExample {

	public static void main(String[] args) {
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("shutdown");
				
			}
		}));
		
		while (true) {
			System.out.println("working");
			Utils.pause(10000);
		}
		
	}
	
}

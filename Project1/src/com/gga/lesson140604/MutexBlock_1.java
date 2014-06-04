package com.gga.lesson140604;

import com.gga.lesson140528.Utils;

public class MutexBlock_1 {
	
	Object mutex = new Object();

	void a() {
		synchronized (mutex) {
			System.out.println("executing method a()");
			Utils.pause(5000);
			System.out.println("finished method a()");	
		}
	}
	
	void b() {
		synchronized (mutex) {
			System.out.println("executing method b()");	
			Utils.pause(5000);
			System.out.println("finished method b()");	
		}
	}
	
    public static void main(String[] args) {
		final MutexBlock mutexblock =  new MutexBlock();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				mutexblock.a();
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				mutexblock.b();
			}
		}).start();
	}
    
}

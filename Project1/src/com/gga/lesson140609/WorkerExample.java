package com.gga.lesson140609;

import com.gga.lesson140528.Utils;


public class WorkerExample {
	
	static class Task implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " started task");
			Utils.pause(1000);
			System.out.println(Thread.currentThread().getName() + " finished task");
	//		throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
	    Worker worker = new Worker();
	    worker.execute(new Runnable() {
			@Override
			public void run() {
                System.out.println(Thread.currentThread().getName() + " hello!");				
			}
		});
		worker.execute(new Task());
		worker.execute(new Task());
		worker.execute(new Task());
		
		worker.shutdown();
	}
	
}

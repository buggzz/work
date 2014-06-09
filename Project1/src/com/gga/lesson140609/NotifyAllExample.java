package com.gga.lesson140609;

import com.gga.lesson140528.Utils;

public class NotifyAllExample {

	final static Object mutex = new Object();

	static class Task implements Runnable {
		@Override
		public void run() {
			synchronized (mutex) {
				try {
					mutex.wait();
					System.out.println(Thread.currentThread().getName());
					Utils.pause(1000);
					System.out.println(Thread.currentThread().getName() + " : started");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Task task = new Task();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();

		Utils.pause(2000);
		synchronized (mutex) {
			Utils.pause(2000);
			mutex.notifyAll();
			Utils.pause(2000);
		}
	}

}

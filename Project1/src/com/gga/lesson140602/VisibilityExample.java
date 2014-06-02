package com.gga.lesson140602;

import com.gga.lesson140528.Utils;

public class VisibilityExample {

	static class Task implements Runnable {
		private boolean stop;

		@Override
		public void run() {
			while(!stop) {
			    System.out.println("working");
			    Utils.pause(1000);
			}
			System.out.println("stopping");
		}
		
		synchronized public void stop() {
			stop = true;
		}
	}
	
	public static void main(String[] args) {
		Task task = new Task();
		new Thread(task).start();
		
		Utils.pause(10000);
		task.stop();
	}
}

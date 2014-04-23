package com.gga.lesson140407.exception;

import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.lock;
import java.util.concurrent.locks.ReentrantLock;

public class UseLock {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock();
		try {
			
		} finally {
			lock.unlock();
		}
	}

}
